package com.spring.ms.user;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	private HashMap<String, User> userById = new HashMap<String, User>();

	public UserRepositoryImpl() {
		User usr = new User(100, "Harish", "New Delhi");
		userById.put("1", usr);

		usr = new User(101, "Nbj", "New Delhi");
		userById.put("2", usr);
		
		usr = new User(102, "Aditi", "Bangalore");
		userById.put("3", usr);

		Logger.getLogger(UserRepositoryImpl.class).info("Created UserRepository");
	}

	@Override
	public ArrayList<User> getAllUsers() {
		return new ArrayList<User>(userById.values());
	}

	@Override
	public User getUser(String id) {
		return userById.get(id);
	}
}
