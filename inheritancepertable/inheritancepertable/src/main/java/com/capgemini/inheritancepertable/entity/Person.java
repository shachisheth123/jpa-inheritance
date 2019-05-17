package com.capgemini.inheritancepertable.entity;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
	
	@Id
	private int personId;

	private String name;
	
	public Person() {
		
		
	}

	public Person(int personId, String name) {
		super();
		this.personId = personId;
		this.name = name;
	}

	
	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
