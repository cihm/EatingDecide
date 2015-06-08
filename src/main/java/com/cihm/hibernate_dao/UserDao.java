package com.cihm.hibernate_dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cihm.controller.UserInfoController;
import com.cihm.hibernate.HibernateUtil;
import com.cihm.pojo.AccountVo;

public class UserDao {

	private static UserDao instance = null;

	private UserDao() {
	}

	public static synchronized UserDao getInstance() {
		if (instance == null)
			instance = new UserDao();
		return instance;
	}
	
	
	public String inserAccount(final AccountVo accountVo) {

		String status = "";
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.save(accountVo);
			session.getTransaction().commit();
			status=UserInfoController.return_success;
		} catch (Exception e) {
			status=UserInfoController.return_fail;
			if (transaction != null) {
				transaction.rollback();
				throw e;
			}
		} finally {
			session.close();
		}

		// HibernateUtil.checkData("select * from grouptable");
		// HibernateUtil.checkData("select * from story");
		
		return status;

	}
	
	
	public String queryAccountExist(final AccountVo accountVo) {

		String status = "";
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		try {
			session.beginTransaction();

			Query query = session
					.createQuery("from AccountVo where name = :name OR email = :email");
			query.setParameter("name", accountVo.getName());
			query.setParameter("email", accountVo.getEmail());

			List<?> list = query.list();
			System.out.println("size"+list.size());
			AccountVo queryAccount = (AccountVo) list.get(0);
			
			if(list.size()>0){
				status = UserInfoController.return_success;
			}else{
				status = UserInfoController.return_fail;
			}
			
			
			System.out.println("hihihi"+queryAccount.getUser_id());
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			status=UserInfoController.return_fail;
		} finally {
			session.close();
		}

		return status;

	}

}
