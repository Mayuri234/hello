package com.example.POC2.model;

public class Message {

	private int code;
	
	private String Message;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	@Override
	public String toString() {
		return "Message [code=" + code + ", Message=" + Message + "]";
	}
	
	
}
