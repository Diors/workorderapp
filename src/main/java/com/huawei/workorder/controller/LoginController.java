package com.huawei.workorder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huawei.workorder.util.JWTUtil;
import com.huawei.workorder.util.ResponseVariable;

@RestController
public class LoginController {
	
	@RequestMapping("/login")
	public ResponseVariable login(@RequestParam("username") String username,
			 @RequestParam("password") String password) {
		return new ResponseVariable(200, "Login success", JWTUtil.sign(username, password));
	}
}
