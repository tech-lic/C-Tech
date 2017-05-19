package com.hi.Dao;

import java.util.List;

import com.hi.entity.User;

public interface UserDao {
public List<User> findUser();
public Integer save(User user);
}
