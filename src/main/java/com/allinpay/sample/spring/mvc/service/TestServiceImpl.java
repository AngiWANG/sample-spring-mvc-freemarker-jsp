package com.allinpay.sample.spring.mvc.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements ITestService {

	public String hello(String name) {
		return "Hello, " + name;
	}

}
