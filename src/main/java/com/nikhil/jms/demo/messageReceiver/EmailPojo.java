package com.nikhil.jms.demo.messageReceiver;

import java.io.Serializable;

public class EmailPojo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String to;
	private String body;
	
	
	public EmailPojo() {
		
	}


	public EmailPojo(String to, String body) {
		super();
		this.to = to;
		this.body = body;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public String getbody() {
		return body;
	}


	public void setbody(String body) {
		this.body = body;
	}


	@Override
	public String toString() {
		return "Email [to=" + to + ", body=" + body + "]";
	}
	
	
	
	

}
