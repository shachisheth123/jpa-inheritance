package com.capgemini.app.hibernate.jpa.service;

import com.capgemini.app.hibernate.jpa.entity.Person;

public interface PersonService  {

	public void addNew(Person person);
	
	public Person getPersonById(int personId);
}
