package com.rain.Dao;


import java.util.List;

import com.rain.entity.User;

public interface UserDao {
	public void save(User user);
	public List<String> findname();

}
