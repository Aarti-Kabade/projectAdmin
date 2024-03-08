package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Admin;
import com.service.AdminServiceInterface;

@RestController
public class AdminController {

	@Autowired
	AdminServiceInterface adnService;
	
	@PostMapping("/add")
	public Admin addAdmin(@RequestBody Admin a)// we can give any name in the place of addemployee
	{
		 adnService.saveAdmin(a);
		 return a;
		 
	}
	
	@PostMapping("/addAll")
	public List<Admin> addAllAdmin(@RequestBody List<Admin> list) {
		adnService.saveAllAdmin(list);
		return list;
	}

}
