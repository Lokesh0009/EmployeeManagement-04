package com.gl.springboot.cruddemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.gl.springboot.cruddemo.dao.UserRepository;
import com.gl.springboot.cruddemo.entity.User;
import com.gl.springboot.cruddemo.security.MyUserDetails;


public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.getUsername(username);
		
		if(user == null) {
			throw new UsernameNotFoundException("Could not Find user");
		}
		
		return new MyUserDetails(user);
	}
}
