package com.capgemini.inheritancepertable.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class MyEmployee extends Person {

	private String company;

	public MyEmployee(int personId, String name, String company) {
		super(personId, name);
		this.company = company;
	}

	public MyEmployee() {

	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
