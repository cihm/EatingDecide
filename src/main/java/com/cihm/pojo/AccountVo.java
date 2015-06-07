package com.cihm.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lewis
 *
 */

@Entity
@Table(name = "user_account_info")
public class AccountVo {
	
	@Id
	@Column(name = "user_id")
	private String user_id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "account")
	private String account;
	@Column(name = "password")
	private String password;
	@Column(name = "authkey")
	private String authkey;

	//i will be autoly "new" by hibernate
	public AccountVo(){
	}
	
	/**
	 * @param user_id
	 * @param name
	 * @param email
	 * @param account
	 * @param password
	 * @param authkey
	 */
	public AccountVo(String user_id, String name, String email, String account,
			String password, String authkey) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.email = email;
		this.account = account;
		this.password = password;
		this.authkey = authkey;
	}

	


	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuthkey() {
		return authkey;
	}

	public void setAuthkey(String authkey) {
		this.authkey = authkey;
	}
	
	

}
