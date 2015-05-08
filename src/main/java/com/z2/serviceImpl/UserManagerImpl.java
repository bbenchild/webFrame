package com.z2.serviceImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.z2.bean.User;
import com.z2.dao.UserDao;
import com.z2.daoImpl.UserDaoImpl;
import com.z2.service.UserManager;

@Service
public class UserManagerImpl implements UserManager {
	
	public static final Logger logger = Logger.getLogger(UserManagerImpl.class);  
	@Autowired
	private UserDao dao;

//	public void setDao(UserDao dao) {
//		this.dao = dao;
//	}

	@Override
	public boolean regUser(User user) {
//		User muser = dao.findOneByUsername(user.getName());
//		if(muser != null){
//			return false;
//		}
//		else
		{
			dao.insert(user);
			return true;
		}
	}

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		List<User> list =  dao.findListByAge(0);
		logger.info("list.size:" + list.size());
		if(list.size()>0){
			return true;
		}
		else{
			return false;
		}
//		User muser = dao.findOneByUsername(user.getName());
//		if (muser != null && muser.getPassword() != null) {
//			if (muser.getPassword().equals(user.getPassword())) {
//				return true;
//			} else {
//				return false;
//			}
//		} else {
//			return false;
//		}
	}

}
