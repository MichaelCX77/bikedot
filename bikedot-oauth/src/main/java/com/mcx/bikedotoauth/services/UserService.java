package com.mcx.bikedotoauth.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
//		User user = userFeignClient.findByEmail(username).getBody();
//		if(user == null) {
//			throw new UsernameNotFoundException("Email not found");
//		}

		return null;
	}
	
}
