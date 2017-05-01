package com.my.test.springmvc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.my.test.springmvc.dao.mapper.UserMapper;
import com.my.test.springmvc.dao.model.User;
import com.my.test.springmvc.dao.model.UserExample;
import com.my.test.springmvc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public boolean checkLoginInfo(String userName, String password) {
		UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(userName);
		List<User> users = userMapper.selectByExample(example);
		if (users.get(0).getUseraddress().equals(password)) {
			return true;
		}
		return false;
	}

	@Override
	public User getUserByName(String userName) {
		UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(userName);
		List<User> users = userMapper.selectByExample(example);
		return users.get(0);
	}

	@Override
	public boolean register(String registerName, String password) {
		User user = new User();
		user.setUsername(registerName);
		user.setUseraddress(password);
		int number = userMapper.insert(user);
		return 1==number;
	}

}
