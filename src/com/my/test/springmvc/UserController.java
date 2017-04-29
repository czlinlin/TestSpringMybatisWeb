package com.my.test.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

	@RequestMapping("login")
	public String login() {
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
