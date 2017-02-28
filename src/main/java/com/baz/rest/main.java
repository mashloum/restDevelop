package com.baz.rest;

import javax.ws.rs.Path;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class main {
	
	private int COUNTER = 0;

	@RequestMapping(value="/")
	public String saySomething() {
		return  "Hello World = " + COUNTER++;
	}

}
