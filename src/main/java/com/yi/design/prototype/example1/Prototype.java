package com.yi.design.prototype.example1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class Prototype implements Cloneable , Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2942775981644172536L;
	
	private String name ;
	
	private List<Object> list;
	
	
	public Prototype clone () throws CloneNotSupportedException{
		
		return  (Prototype)super.clone();
	}
	
	public Prototype deepClone() throws IOException, ClassNotFoundException{
		//读取本对象数据
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ObjectOutputStream objout = new ObjectOutputStream(out);
		objout.writeObject(this);
		
		//写出本对象的数据
		ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
		ObjectInputStream objIn = new ObjectInputStream(in);
								
		return (Prototype)objIn.readObject();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	
	

}
