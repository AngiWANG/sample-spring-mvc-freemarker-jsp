package com.allinpay.sample.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.allinpay.sample.spring.mvc.service.ITestService;

@Controller
public class ShowMessageController {
	
	@Autowired
	private ITestService testServiceImpl;

	@RequestMapping("/showMessage")
	public ModelAndView showMessage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("showMessage");
		modelAndView.addObject("message", testServiceImpl.hello("World"));
		return modelAndView;
	}
}
