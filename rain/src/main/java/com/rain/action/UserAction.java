package com.rain.action;


import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.rain.Dao.UserDao;
import com.rain.entity.User;

public class UserAction extends ActionSupport {

UserDao userDao;
User user;
List<String> names;
	
	public List<String> getNames() {
	return names;
}


public void setNames(List<String> names) {
	this.names = names;
}


	public User getUser() {
	return user;
}


public void setUser(User user) {
	this.user = user;
}


	public UserDao getUserDao() {
	return userDao;
}


public void setUserDao(UserDao userDao) {
	this.userDao = userDao;
}


	public String save(){
		System.out.println(100);
		System.out.println(null==userDao);
		userDao.save(user);	
		return "save";
	}
	public String findname(){
		names=userDao.findname();
		return "name";
	}
}
