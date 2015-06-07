package com.cihm.controller;


import org.hibernate.Session;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cihm.model.UserModel;
import com.cihm.pojo.AccountVo;
import com.cihm.hibernate.HibernateUtil;

@RestController
@RequestMapping(value = "/user")

public class UserInfoController {

	
	public static String return_fail="fail";
	public static String return_success="success";
	
	// Post method
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public String regist(
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "account", required = true) String account,
			@RequestParam(value = "password", required = true) String password) {

		System.out.print("i m  in :" + name + name);

		long currentTime = System.currentTimeMillis();

		String user_default_id = "abMart" + currentTime;

		AccountVo accountVo = new AccountVo(user_default_id, name, email,
				account, password, null);

		UserModel UserModel = new UserModel();
		
		return UserModel.regist(accountVo);
	}

}
