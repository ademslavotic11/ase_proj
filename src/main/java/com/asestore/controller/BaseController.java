package com.asestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BaseController {
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/UserAccount")
	public String UserAccount(){
		return "UserAccount";
	}
	
	@RequestMapping("/login")
	public String login(Model model){
		model.addAttribute("classAcctiveLogin", true);
		return "UserAccount";
	}
		
	
}
