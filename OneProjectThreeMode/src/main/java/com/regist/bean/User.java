package com.regist.bean;

import java.io.Serializable;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(String name, String pws) {
		super();
		this.name = name;
		this.pws = pws;
	}



	private String name;
	
	
	
	private String pws;



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPws() {
		return pws;
	}



	public void setPws(String pws) {
		this.pws = pws;
	}



	@Override
	public String toString() {
		return "User [name=" + name + ", pws=" + pws + "]";
	}
	
	

}
