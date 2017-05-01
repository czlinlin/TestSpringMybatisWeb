package com.my.test.springmvc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.test.springmvc.dao.model.User;
import com.my.test.springmvc.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("login")
	public String login() {
		return "user/login";
	}

	@RequestMapping("loginSubmit")
	public String loginSubmit(String loginName, String password) {
		// boolean result = userService.checkLoginInfo(loginName, password);
		// if (result) {
		// return "success";
		// } else {
		// return "fail";
		// }

		User user = userService.getUserByName(loginName);
		if (user != null && user.getUseraddress().equals(password)) {
			return "success";
		} else {
			return "fail";
		}
	}

	@RequestMapping("registerSubmit")
	public String registerSubmit(String registerName, String password) {

		boolean i = userService.register(registerName, password);

		if (i) {
			return "user/login";
		} else {
			return "fail";
		}

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
