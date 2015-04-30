package com.z2.service;

import com.z2.bean.User;

public interface UserManager {
	public boolean regUser(User user);
	
	public boolean checkUser(User user);
}
