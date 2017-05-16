package com.dao;


import java.util.List;

import com.entity.User;

public interface UserDao {
	//public User login(User user);
	public void sa(User user);
	//public String find();
	public List<User> find();
	public void delete(User user);
	
	public User findUser(Integer id);
	
	public void delete1(Integer id);
	public void update(User user);
	public List<User> findone(String name);
	public int count();
	
	public List<String> username();
}
