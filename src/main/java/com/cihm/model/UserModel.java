package com.cihm.model;

import com.cihm.controller.UserInfoController;
import com.cihm.hibernate_dao.UserDao;
import com.cihm.pojo.AccountVo;

public class UserModel {

	public UserModel() {
	}
	
	public String regist(final AccountVo accountVo){
		
		String status;
		//query user exist
		if (UserDao.getInstance().queryAccountExist(accountVo)
				.equals(UserInfoController.return_success)) {

			//means user exists
			status = UserInfoController.return_fail;
			
		}else{
			//insert user
			status = UserDao.getInstance().inserAccount(accountVo);
		}
		
		
		
		return status;
		
	}
	
}
