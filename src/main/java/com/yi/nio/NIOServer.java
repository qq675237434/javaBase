package com.yi.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * NIO 实例
 * @author Administrator
 *
 */
public class NIOServer {
	
	private int flag = 1 ;
	private int size = 1024 ;
	//构建缓冲区
	private ByteBuffer sendBuffer = ByteBuffer.allocate(size);
	private ByteBuffer reviceBuffer = ByteBuffer.allocate(size);
	private Selector selector = null ;

	
	//初始化
	public NIOServer(int port) throws IOException{
		//构建channel 
		ServerSocketChannel serverChannel = ServerSocketChannel.open();
		serverChannel.configureBlocking(false);
		ServerSocket clientChannel = serverChannel.socket() ;
		//监听端口
		clientChannel.bind(new InetSocketAddress(port));
		selector = Selector.open();
		//注册事件
		serverChannel.register(selector, SelectionKey.OP_ACCEPT);
		System.out.println("NIOServer start");
		
	}
	
	public void eventHandler() throws IOException{
		//监听
		while(true){
			selector.select();
			Set<SelectionKey> selectKeys = selector.selectedKeys();
			Iterator<SelectionKey> iter = selectKeys.iterator();
			while(iter.hasNext()){
				SelectionKey key = iter.next();
				iter.remove();
				handlerKey(key);
			}
		}
		
		
	}
	
	public void handlerKey(SelectionKey key) throws IOException{
		ServerSocketChannel server = null ;
		SocketChannel client = null ;
		String sendText = null ;
		String reciveText = null ;
		int count = 0 ;
		
		if(key.isAcceptable()){
			//客户端连接，开始注册写事件	
			server = (ServerSocketChannel) key.channel();
			client = server.accept();
			client.configureBlocking(false);
			//开始注册读事件
			client.register(selector, SelectionKey.OP_READ);
			
		}else if(key.isReadable()){
			client = (SocketChannel) key.channel();
			reviceBuffer.clear();
			count = client.read(reviceBuffer);
			if(count > 0){
				reciveText = new String(reviceBuffer.array() , 0 , count);
				System.out.println("服务端接受到客户端的数据：" + reciveText);
				
				//开始注册写事件
				client.register(selector, SelectionKey.OP_WRITE);
			}
		}else if (key.isWritable()) {
			
			client  = (SocketChannel) key.channel();
			sendBuffer.clear() ;
			sendText = "服务端发送给客户端：" + flag++ ;
			sendBuffer.put(sendText.getBytes());
			
		}
	}
	public static void main(String[] args) throws IOException {
		NIOServer server = new NIOServer(7080);
		server.eventHandler();
	}

}
