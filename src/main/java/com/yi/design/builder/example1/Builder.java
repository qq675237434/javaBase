package com.yi.design.builder.example1;

import java.util.ArrayList;
import java.util.List;

public class Builder {
	
	// 多个发动对象
	private List<Sender> sends ;
	
	/**
	 * 批量构建MailSend 对象
	 * @param size
	 * @return
	 */
	public List<Sender> buildMailSender(int size){
		sends = new ArrayList<Sender>(size);
		for(int i = 0 ; i < size ; i++){
			MailSender s = new MailSender();
			sends.add(s);
		}
		return sends;
	}
	
	/**
	 * 批量构建sms
	 * @param size
	 * @return
	 */
	public List<Sender> buildSmsSender(int size){
		sends = new ArrayList<Sender>(size);
		
		for(int  i = 0 ; i < size ; i++){
			SmsSender s = new SmsSender();
			sends.add(s);
		}
		
		return sends;
	}
	

	public List<Sender> getSends() {
		return sends;
	}

	public void setSends(List<Sender> sends) {
		this.sends = sends;
	}
	
	

}
