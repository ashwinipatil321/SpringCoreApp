package com.dependancyInjection.Controller;

import com.dependancyInjection.model.Messaging;

public class ActiveMQMessaging implements Messaging{
	 public void sendMessage() {
	        System.out.println("Sending Message via Active MQ");
	    }
}
