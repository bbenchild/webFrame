package com.z2.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.z2.bean.User;
import com.z2.dao.UserDao;
import com.z2.service.UserManager;

@Service
public class UserManagerImpl implements UserManager {
	@Autowired
	private UserDao dao;

//	public void setDao(UserDao dao) {
//		this.dao = dao;
//	}

	@Override
	public boolean regUser(User user) {
		User muser = dao.findOneByUsername(user.getName());
		if(muser != null){
			return false;
		}
		else{
			dao.insert(user);
			return true;
		}
	}

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		User muser = dao.findOneByUsername(user.getName());
//		System.out.println("user:" + user.toString());
//		System.out.println("muser:" + muser.toString());
		if (muser != null && muser.getPassword() != null) {
			if (muser.getPassword().equals(user.getPassword())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
