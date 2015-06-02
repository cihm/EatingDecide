package com.cihm.pojo;

/**
 * @author lewis
 *
 */
public class PeopleVo {
	private String name;
	private Integer age;
	private String eatHobby;
	private String eatHobby2;
	
	public PeopleVo(String name, Integer age, String eatHobby, String eatHobby2) {
		super();
		this.name = name;
		this.age = age;
		this.eatHobby = eatHobby;
		this.eatHobby2 = eatHobby2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEatHobby() {
		return eatHobby;
	}

	public void setEatHobby(String eatHobby) {
		this.eatHobby = eatHobby;
	}

	public String getEatHobby2() {
		return eatHobby2;
	}

	public void setEatHobby2(String eatHobby2) {
		this.eatHobby2 = eatHobby2;
	}
	

}
