package org.hcl.service;

import java.util.Optional;

import org.hcl.model.User;

public interface UserService {
	boolean register(User user);
	boolean validate(User user);
	public Optional<User> getUserByUsername(String username);

}
