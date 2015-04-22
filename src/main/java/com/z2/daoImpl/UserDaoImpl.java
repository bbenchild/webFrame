package com.z2.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.z2.bean.User;
import com.z2.dao.UserDao;

public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveUser(User u) throws HibernateException {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(u);

	}

	@Override
	public boolean checkUser(User u) throws HibernateException {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		String hql = "from User as a where a.name=? ";
		Query query = session.createQuery(hql);
		query.setString(0, u.getName());
		List<User> list=query.list();
		session.close(); 
		if(list != null && list.size() > 0 )
		{
			return true;
		}
		else
		{
			return false;
		}
        //如果确定数据最多只有一条，可以使用一下的方法简化代码  
//        User u= (User)query.uniqueResult();  
//        System.out.print("只有一条数据"+u.getName());  
		
	}

}
