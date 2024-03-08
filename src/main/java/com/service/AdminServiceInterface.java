package com.service;

import java.util.List;

import com.model.Admin;


public interface AdminServiceInterface {

	public Admin saveAdmin(Admin a);
	
	public List<Admin>saveAllAdmin(List<Admin>list);
}
