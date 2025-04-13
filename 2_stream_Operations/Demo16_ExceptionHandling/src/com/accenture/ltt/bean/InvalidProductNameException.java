package com.accenture.ltt.bean;

public class InvalidProductNameException extends Exception{
	public InvalidProductNameException(String message) {
		super(message);
	}
	public InvalidProductNameException() {
		super();
	}
}
