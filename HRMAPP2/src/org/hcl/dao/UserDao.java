package org.hcl.dao;

import java.util.Optional;

import org.hcl.model.User;

public interface UserDao {
	boolean insert(User user);
	boolean validate(User user);
	public Optional<User> getUserByUsername(String username);
}
