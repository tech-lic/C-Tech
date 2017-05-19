package com.hi.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hi.Dao.UserDao;
import com.hi.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public List<User> findUser() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from User");
		
	}

	@Override
	public Integer save(User user) {
		// TODO Auto-generated method stub
		//this.getHibernateTemplate().save(user);
		Session session=this.getSessionFactory().openSession();
		session.save(user);
	    return 1;
	}

}
