package com.my.test.springmvc.service;

import com.my.test.springmvc.dao.model.User;

public interface UserService {

	public boolean checkLoginInfo(String userName, String password);

	public User getUserByName(String userName);

	public boolean register(String registerName, String password);

}
