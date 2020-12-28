package org.hcl.service;

import java.util.Optional;

import org.hcl.dao.UserDao;
import org.hcl.dao.UserDaoImpl;
import org.hcl.model.User;

public class UserServiceImpl implements UserService{
UserDao dao=new UserDaoImpl();

@Override
public boolean register(User user) {
	boolean b=false;
	if(user!=null)
	{
b=dao.insert(user);
	
}
	return b;
}
@Override
public boolean validate(User user) {
	boolean b=false;
	if(user!=null)
	{
		b=dao.validate(user);
	}

	return b;
}
@Override
public Optional<User> getUserByUsername(String username) {
	// TODO Auto-generated method stub
	return dao.getUserByUsername(username);
}

}
