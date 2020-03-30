package com.linghuganyu.common.domain;

import java.util.Date;

/**
 * 
 * @ClassName: Person 
 * @Description: Person实体类
 * @author: Administrator
 * @date: 2020年3月30日 下午3:02:49
 */
public class Person {

	//姓名(name)、年龄(age)、介绍(about)、注册日期(created)
	private String name;
	
	private Integer age;
	
	private String about;
	
	private Date created;

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

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Person(String name, Integer age, String about, Date created) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.created = created;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", created=" + created + "]";
	}
	
	
	
}
