package com.cihm.model;

import com.cihm.hibernate_dao.UserDao;
import com.cihm.pojo.AccountVo;

public class UserModel {

	public UserModel() {
	}
	
	public String regist(final AccountVo accountVo){
		
		String status;
		//query user exist
		UserDao.getInstance().queryAccountExist(accountVo);
		
		//insert user
		status = UserDao.getInstance().inserAccount(accountVo);
		
		
		return status;
		
	}
	
}
