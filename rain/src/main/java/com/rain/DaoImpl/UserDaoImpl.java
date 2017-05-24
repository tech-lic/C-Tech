package com.rain.DaoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.rain.Dao.UserDao;
import com.rain.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
		

	}

	@Override
	public List<String> findname() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("select name from User");
	}

}
