package com.yi.design.prototype.example2;

import java.io.Serializable;
import java.util.List;

public class Prototype implements Cloneable , Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5853427772173809066L;
	
	private String name ;
	
	private List<String> list ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	public Prototype cloneSelf() throws CloneNotSupportedException{
		return (Prototype)super.clone();
	}

}
