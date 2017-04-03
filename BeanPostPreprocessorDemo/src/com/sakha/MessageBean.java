package com.sakha;

public class MessageBean {
private String message;

public MessageBean(){
	System.out.println("constructor of message bean.");
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
public void init() throws Exception{
	System.out.println("init message");
}
public void destroy() throws Exception{
	System.out.println("destroy method");
}
}
