package com.hi.dao;

import java.util.List;

import com.hi.entity.User;

public interface UserDao {
public void save(User user); //保存对象
public List<String> findname();
}
