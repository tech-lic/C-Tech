package com.hi.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hi.Dao.UserDao;
import com.hi.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
    

	private UserDao userDao;
	private List<User> list;
	private User user;
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

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	public String findUser() {
		System.out.println("0000");
		list = userDao.findUser();
		System.out.println(list.size());
		return "find";
	}

	public String save() {
		System.out.println(user.getName());
		int a = userDao.save(user);
		System.out.println(a);
		return "save";
	}
	public String findnames(){
		
		names=userDao.findname();
		System.out.println(names.size());
		return "name";
	}
}
