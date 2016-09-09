/*package com.autobodyshop.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.autobodyshop.model.Account;
import com.autobodyshop.repository.AccountRepository;
//http://ryanjbaxter.com/2015/01/06/securing-rest-apis-with-spring-boot/
@Configuration
public class WebSecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {

	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		//auth.userDetailsService(UserDetailsService()));
		auth.userDetailsService(userDetailsService());
	}
	
	@Bean
	UserDetailsService userDetailsService(){
		
		
		return new UserDetailsService() {

		      @Override
		      public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		        Account account = accountRepository.findByUserName(username);
		        if(account != null) {
		        return new User(account.getUsername(), account.getPassword(), true, true, true, true,
		                AuthorityUtils.createAuthorityList("USER"));
		        } else {
		          throw new UsernameNotFoundException("could not find the user '"
		                  + username + "'");
		        }
		      }
		      
		    };
		  }
		
		
	}
	

*/