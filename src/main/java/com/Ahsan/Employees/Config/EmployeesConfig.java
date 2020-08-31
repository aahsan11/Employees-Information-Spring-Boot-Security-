package com.Ahsan.Employees.Config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.web.bind.annotation.RequestMapping;


@Configuration
@EnableWebSecurity
@EnableOAuth2Sso

public class EmployeesConfig extends WebSecurityConfigurerAdapter {
	
//@Autowired
//	private MyUserDetailsService userDetailsService;
//	
//	@Bean
//	public AuthenticationProvider authentication() {
//		
//		DaoAuthenticationProvider provider= new DaoAuthenticationProvider();
//		provider.setPasswordEncoder(new BCryptPasswordEncoder());
////		
//		provider.setUserDetailsService(userDetailsService);
////		
//		return provider;
////		
////		
//	}
////
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
////		
////		
//		http
//		.csrf().disable()
//		.authorizeRequests().antMatchers("/login").permitAll()
//		.antMatchers("/JS/**").permitAll()
//		.antMatchers("/css/**").permitAll()
//		.antMatchers("/Images/**").permitAll()
//		.antMatchers("/BootStrap/**").permitAll()
//		.anyRequest().authenticated()
////		
////	
//		.and()
//		.formLogin().loginPage("/login").permitAll()
////		
////		
////		
//		.defaultSuccessUrl("/")
//		.and()
//		.logout().invalidateHttpSession(true)
//		.clearAuthentication(true)
////		
//		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//		 .deleteCookies("JSESSIONID")
////		
//		.logoutSuccessUrl("/logout-success").permitAll();
//		
//	}


	

	
//	
	@Override // this is for springOAuth which is google authorization
	protected void configure(HttpSecurity http) throws Exception {
//
	http
	.csrf().disable()
	.authorizeRequests().antMatchers("/login").permitAll()
		.anyRequest().authenticated()
//
//	
	.and()
	.logout().invalidateHttpSession(true)
	.clearAuthentication(true)
//	
//
//.logoutSuccessUrl("http://localhost:9090/oauth2/authorization/google").permitAll()
	.logoutSuccessUrl("/logout-success").permitAll();
//	
}
//	
// 
	
	
	
	
	
	
	

}
