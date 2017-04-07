package com.asestore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.asestore.domain.User;
import com.asestore.repository.UserRepo;


@Service
public class UserSecurityService implements UserDetailsService {
	@Autowired
	private UserRepo userRepo;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		
		User user = userRepo.findByUsername(username);
		
		if(null == user){
			throw new UsernameNotFoundException("Username not found");
			
		}
		
		return user;
		
		
		
	}
	
}
