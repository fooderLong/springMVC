package com.test.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testhello")
public class TestController  {
	@RequestMapping("/mvc.do")
	public String getTest(Model model){
		model.addAttribute("message", "Hello girl!!");
		return "test";
	}
	@RequestMapping("/transmit")
	public String toTransmit(Model model){
		return "transmitvalue";
	}

}
