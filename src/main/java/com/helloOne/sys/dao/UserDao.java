package com.helloOne.sys.dao;



import java.util.List;

import com.helloOne.sys.entity.User;

public interface UserDao {
	public List<User> findAll();
	public void insert(User user);
}
