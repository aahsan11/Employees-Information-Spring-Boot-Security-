package com.Ahsan.Employees.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.Ahsan.Employees.Model.User;
import com.Ahsan.Employees.Repo.SpringRepository;



@Component
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private SpringRepository repo;

	@Override
	public UserDetails loadUserByUsername(String Username) throws UsernameNotFoundException {
		
		User user=repo.findByUsername(Username);
		if (user==null) {
			
			throw new UsernameNotFoundException("not found");
		}
		
		else {
			return new UserPrincipals(user);
		}
		
		
	}

}
