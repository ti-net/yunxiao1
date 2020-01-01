package com.tinet.yunxiao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/")
	public String index() {
		String aaa="app1";
		return "app1";
	}
}
