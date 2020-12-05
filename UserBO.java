package com.hcl.task4;

import java.util.ArrayList;
import java.util.List;

public class UserBO extends ArrayList {
	private User user;

	public UserBO(User user) {
		this.user = user;
	}

	public UserBO() {
	}

	UserBO getList() {
		UserBO user1 = new UserBO();

		if (this.user != null)
			user1.add(this.user);
		return user1;
	}
}