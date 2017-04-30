package com.my.test.springmvc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.test.springmvc.dao.mapper.UserMapper;
import com.my.test.springmvc.dao.model.User;

@Controller
@RequestMapping("user")
public class UserController {

	@Resource
	private UserMapper UserMapper;

	@RequestMapping("login")
	public String login() {
		User user = UserMapper.selectByPrimaryKey(1);
		System.out.println(user.getUsername());
		return "user/login";
	}

	@RequestMapping("register")
	public String register() {
		return "user/register";
	}

	@RequestMapping("changePassword")
	public String changePassword() {
		return "user/login";
	}

}
