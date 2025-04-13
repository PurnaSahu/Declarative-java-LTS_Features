package com.pbs.acc;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProductNotAvailableException extends Exception{
	
	public String message;
	public LocalDateTime date;
	
	//LocalDateTime dateTime = LocalDateTime.now();
	//DateTimeFormatter format= DateTimeFormatter.ofPattern("hh:mm a yyyy-MM-dd");
    
	
	public ProductNotAvailableException() {
		super("Product Not available");
	}

	public ProductNotAvailableException(String message, LocalDateTime date) {
		super(String.format("Ooops!! product not found. find more details, message: %s on Date: %s", message,date));
		this.message = message;
		this.date = date;
	}
}
