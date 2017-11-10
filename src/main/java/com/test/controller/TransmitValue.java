package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class TransmitValue {
	@RequestMapping("/login.do")
	public String login(@RequestParam("username")String username,@RequestParam("password") String password,Model model){
		if("admin".equals(username)){
			model.addAttribute("username", username);
			return "login";
		}else{
			return "error";
		}
		
	}

}
