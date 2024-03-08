package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Admin;
import com.repository.AdminRepository;


@Service
public class AdminServiceImplementation implements AdminServiceInterface {

	@Autowired
	AdminRepository adnRepo;

	
	@Override
	public Admin saveAdmin(Admin a) {
		
		adnRepo.save(a);
		return a;
	}


	@Override
	public List<Admin> saveAllAdmin(List<Admin> list) {
		adnRepo.saveAll(list);
		return list;
	}

}
