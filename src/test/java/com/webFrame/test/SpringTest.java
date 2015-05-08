package com.webFrame.test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.z2.bean.User;

  
import com.z2.dao.UserDao;
import com.z2.daoImpl.UserDaoImpl;

import org.springframework.context.ConfigurableApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class SpringTest {
	private static ApplicationContext ac;

	@BeforeClass
	public static void testAc() {
		ac = new ClassPathXmlApplicationContext(new String[] {
				"classpath:spring.xml", "classpath:spring-mongodb.xml" });
	}

//	// 测试sessionFactory
//	@Test
//	public void testSessionFactory() {
//		SessionFactory sessionFactory = (SessionFactory) ac
//				.getBean("sessionFactory");
//		System.out.println(sessionFactory);
//	}

	// 测试事务
	@Test
	public void testTransaction() {
        System.out.println("Bootstrapping HelloMongo");  
        
        ConfigurableApplicationContext context = null;  
        context = new ClassPathXmlApplicationContext("spring-mongodb.xml");  
  
        UserDao userDao = context.getBean(UserDaoImpl.class);  
            userDao._test();  
            User entity1 = new User();  
        entity1.setName("ada");  
        entity1.setAge(1);  
        entity1.setBirth(new Date());  
        entity1.setPassword("asdfasdf");  
        entity1.setRegionName("北京");  
        entity1.setWorks(1);  
//        userDao.insert(entity1);  
        userDao.update(entity1);  
        userDao.createCollection();  
      
        List<User> list = userDao.findList(0, 10);  
        for (User e : list) {  
            System.out.println("all - id=" + e.getId() + ", age=" + e.getAge() + ", password=" + e.getPassword() + ", regionName=" + e.getRegionName() + ", special=" + Arrays.toString(e.getSpecial())  
                    + ", name=" + e.getName() + ", birth=" + e.getBirth());  
        }  
        list.clear();
        list = userDao.findListByAge(1);  
        for (User e : list) {  
            System.out.println("age=1 - id=" + e.getId() + ", age=" + e.getAge() + ", password=" + e.getPassword() + ", regionName=" + e.getRegionName() + ", special="  
                    + Arrays.toString(e.getSpecial()) + ", name=" + e.getName() + ", birth=" + e.getBirth());  
        }  
//  
//        User e = userDao.findOne("5");  
//        System.out.println("id=1 - id=" + e.getId() + ", age=" + e.getAge() + ", password=" + e.getPassword() + ", regionName=" + e.getRegionName() + ", special=" + Arrays.toString(e.getSpecial())  
//                + ", name=" + e.getName() +  ", birth=" + e.getBirth());  
//  
//        e = userDao.findOneByUsername("limingnihao");  
//        System.out.println("username=limingnihao - id=" + e.getId() + ", age=" + e.getAge() + ", password=" + e.getPassword() + ", regionName=" + e.getRegionName() + ", special="  
//                + Arrays.toString(e.getSpecial()) + ", name=" + e.getName() + ", birth=" + e.getBirth());  
//  
          
        System.out.println("DONE!");  
	}
	
}
