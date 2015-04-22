package com.z2.serviceImpl;

import com.z2.bean.User;
import com.z2.dao.UserDao;
import com.z2.service.UserManager;


public class UserManagerImpl implements UserManager {
    private UserDao dao;  
    
    public void setDao(UserDao dao) {  
        this.dao = dao;  
    }  
	@Override
	public void regUser(User user) {

	        dao.saveUser(user);  
	}
	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		return dao.checkUser(user);
	}

}
