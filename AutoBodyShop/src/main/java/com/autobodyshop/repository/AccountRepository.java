package com.autobodyshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.autobodyshop.model.Account;


public interface AccountRepository extends MongoRepository<Account, String> {
	
	public Account findByUserName(String userName);

}
