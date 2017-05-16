package com.dao.impl;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

import com.dao.UserDao;
import com.entity.User;


public class UserDaoImpl extends HibernateDaoSupport implements UserDao {


	@Override
	public void sa(User user) {
		// TODO Auto-generated method stub
		//this.getHibernateTemplate().save(user);
		//this.getSessionFactory().openSession().save(user);
		//this.getSession().save(user);
		this.getHibernateTemplate().persist(user);
		
	}

	

//查询所有的数据
	@Override
	public List<User> find() {
		Session session=this.getSessionFactory().openSession();
		Long count=(Long) session.createQuery("select  count(*) from User").uniqueResult();
	    List<User> list=session.createQuery("from User").setFirstResult(0).setMaxResults(5).list();
	    return  list;
	}




	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
		this.getHibernateTemplate().delete(user);
		
	}



//根据id查询一个对象
	@Override
	public User findUser(Integer id) {
		// TODO Auto-generated method stub
		Session session=this.getSessionFactory().openSession();
		
		User user=(User) session.load(User.class,id);
	    return	user;
	}
	@Override
	public void delete1(Integer id) {
		// TODO Auto-generated method stub
		Session session=this.getSessionFactory().openSession();
      User user=(User) session.get(User.class, id);
      this.getHibernateTemplate().delete(user);
      

	}
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(user);
	}



//根据姓名模糊查询
	@Override
	public List<User> findone(String name) {
		// TODO Auto-generated method stub
		Session session=this.getSessionFactory().openSession();
		String sql="from User u where u.name like :name";
		Query query=session.createQuery(sql); 
		query.setParameter("name", "%"+name+"%");
	    return  query.list();
	}




	@Override
	public int count() {
		// TODO Auto-generated method stub
		Session session=this.getSessionFactory().openSession();
		Number num=(Number) session.createQuery("select count(*) from User").uniqueResult();
		return  num.intValue();
		
	}



	@Override
	public List<String> username() {
		// TODO Auto-generated method stub
		Session session=this.getSessionFactory().openSession();
		Query query=session.createQuery("select name from User");
		
		return query.list();
	}



}
