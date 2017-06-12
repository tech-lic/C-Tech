package com.non.action;

import com.non.Dao.UserDao;
import com.non.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
private UserDao userDao;
private User user;	
	
	public UserDao getUserDao() {
	return userDao;
}

public void setUserDao(UserDao userDao) {
	this.userDao = userDao;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

	public String save(){
		userDao.save(user);
		return "save";
	}
}
