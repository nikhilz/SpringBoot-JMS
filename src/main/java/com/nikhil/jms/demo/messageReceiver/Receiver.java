package com.nikhil.jms.demo.messageReceiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	@JmsListener(destination = "mailbox",containerFactory = "myFactory")
	public void receiveMesage(EmailPojo email) {
		System.out.println("Received <"+email+">");
	}
}
