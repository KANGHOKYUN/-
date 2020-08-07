package com.example.millgo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.millgo.service.PhoneService;
import com.example.millgo.dto.Phone;


@Controller
public class MyController {
	@Autowired
	PhoneService phoneService;
	@GetMapping("/")
	public String getHTMLHello() {
		return "hello";
	}
	@GetMapping("/allprice")
	@ResponseBody
	public List<Phone> getAllPhone() {
		return phoneService.getAllPhone();
	}

	@GetMapping("/test")
	public String getTESTHello() {
		return "hello";
	}


	@GetMapping("/insertPhone")
	@ResponseBody
	public boolean insertPhone() {
		Phone phone = new Phone("MyPhone", 1,1);
		return phoneService.insertPhone(phone);
	}
}