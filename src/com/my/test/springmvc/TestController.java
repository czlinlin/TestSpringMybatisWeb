package com.my.test.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {

	@RequestMapping("a")
	public String sayHello() {
		return "success";
	}

	@RequestMapping("b")
	public String sayWolrd() {
		return "fail";
	}

}
