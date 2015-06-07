package com.cihm.sample_controller;


import org.hibernate.Session;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cihm.pojo.AccountVo;
import com.cihm.hibernate.HibernateUtil;

@RestController
@RequestMapping(value = "/hibernate")

public class HibernateController {

	
	// Post method
	@RequestMapping(value = "/testPost", method = RequestMethod.POST)
	public AccountVo regist(
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "account", required = true) String account,
			@RequestParam(value = "password", required = true) String password) {

		 System.out.print("i m  in :" + name+name);
		
		 AccountVo accountVo = new AccountVo("null",name, email,account,password,null);
		// Session session = HibernateUtil.getSessionFactory().openSession();
		// session.beginTransaction();
		 //session.save(person);
		 //session.getTransaction().commit();
		 //session.close();
		 
		return accountVo;
	}

}
