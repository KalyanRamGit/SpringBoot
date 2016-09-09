package com.autobodyshop.appconfig;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.autobodyshop.model.Account;
import com.autobodyshop.repository.AccountRepository;


		
		/*@Configuration
		@ComponentScan
		@EnableAutoConfiguration*/
        
        @SpringBootApplication
		public class Application {
			public static void main(String[] args) {
				SpringApplication.run(Application.class, args);
			}
		
			/*@Bean
		    CommandLineRunner init(final AccountRepository accountRepository) {
				
			//return	(String)->accountRepository.save(new Account("kalyan", "password"));
		      
		      return new CommandLineRunner() {

		        @Override
		        public void run(String... arg0) throws Exception {
		          accountRepository.save(new Account("Ram", "password"));
		          
		        }
		        
		      };
			}*/
	}


