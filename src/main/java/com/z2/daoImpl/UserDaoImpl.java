package com.z2.daoImpl;

import java.util.List;
import java.util.Set; 

import com.z2.bean.User;
import com.z2.dao.UserDao;

import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.data.domain.Sort;  
import org.springframework.data.domain.Sort.Direction;  
import org.springframework.data.domain.Sort.Order;  
import org.springframework.data.mongodb.core.MongoTemplate;  
import org.springframework.data.mongodb.core.query.Criteria;  
import org.springframework.data.mongodb.core.query.Query;  
import org.springframework.data.mongodb.core.query.Update;  
import org.springframework.stereotype.Repository;  
  

import com.mongodb.DB;  

@Repository 
public class UserDaoImpl implements UserDao {

	 public static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);  
	
	 @Autowired  
	    private MongoTemplate mongoTemplate;  
	 
	@Override
	public void _test() {
		// TODO Auto-generated method stub
	       Set<String> colls = this.mongoTemplate.getCollectionNames();  
	        for (String coll : colls) {  
	            logger.info("CollectionName=" + coll);  
	        }  
	        DB db = this.mongoTemplate.getDb();  
	        logger.info("db=" + db.toString());  
	}

	 @Override  
	    public void createCollection() {  
	        if (!this.mongoTemplate.collectionExists(User.class)) {  
	            this.mongoTemplate.createCollection(User.class);  
	        }  
	    }  
	  
	    @Override  
	    public List<User> findList(int skip, int limit) {  
	        Query query = new Query();  
	        query.with(new Sort(new Order(Direction.ASC, "_id")));  
	        query.skip(skip).limit(limit);  
	        return this.mongoTemplate.find(query, User.class);  
	    }  
	  
	    @Override  
	    public List<User> findListByAge(int age) {  
	        Query query = new Query();  
	        query.addCriteria(new Criteria("age").is(age));  
	        return this.mongoTemplate.find(query, User.class);  
	    }  
	  
	    @Override  
	    public User findOne(String id) {  
	        Query query = new Query();  
	        query.addCriteria(new Criteria("_id").is(id));  
	        return this.mongoTemplate.findOne(query, User.class);  
	    }  
	  
	    @Override  
	    public User findOneByUsername(String username) {  
	        Query query = new Query();  
	        query.addCriteria(new Criteria("name").is(username));  
	        return this.mongoTemplate.findOne(query, User.class);  
	    }  
	  
	    @Override  
	    public void insert(User entity) {  
	        this.mongoTemplate.insert(entity);  
	  
	    }  
	  
	    @Override  
	    public void update(User entity) {  
	        Query query = new Query();  
	        query.addCriteria(new Criteria("_id").is(entity.getId()));  
	        Update update = new Update();  
	        update.set("age", entity.getAge());  
	        update.set("password", entity.getPassword());  
	        update.set("regionName", entity.getRegionName());  
	        update.set("special", entity.getSpecial());  
	        update.set("works", entity.getWorks());  
	        update.set("name", entity.getName());  
	        this.mongoTemplate.updateFirst(query, update, User.class);  
	  
	    }

}
