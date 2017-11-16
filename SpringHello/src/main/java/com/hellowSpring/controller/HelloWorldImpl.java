package com.hellowSpring.controller;

import com.hellowSpring.model.HelloWorld;

public class HelloWorldImpl implements HelloWorld {
	  public void sayHello(String name) {
	        System.out.println("Hello "+name);
}
}