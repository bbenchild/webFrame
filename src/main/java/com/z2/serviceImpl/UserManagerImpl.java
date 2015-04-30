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

		dao.insert(user);
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
