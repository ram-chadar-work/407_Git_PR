package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String name;
	private int age;
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}

	public Employee(int eid, String name, int age) {
		super();
		this.eid = eid;
		this.name = name;
		this.age = age;
		
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + "]";
	}

	
	
	

}
