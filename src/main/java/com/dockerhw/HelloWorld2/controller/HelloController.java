package com.dockerhw.HelloWorld2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	@GetMapping(path = "/hello-world")
	private Hello helloWorld() {
		return new Hello("Hello World");
	}
	
	@GetMapping(path = "/hello-world/path-variable/{name}")
	private Hello helloWorldPathVariable(@PathVariable		 String name) {
		return new Hello(String.format("Hello World, %s", name));
	}
}