package com.z2.dao;

import org.hibernate.HibernateException;

import com.z2.bean.User;

public interface UserDao {
	public void saveUser(User u) throws HibernateException; 
	
	public boolean checkUser(User u) throws HibernateException; 
}
