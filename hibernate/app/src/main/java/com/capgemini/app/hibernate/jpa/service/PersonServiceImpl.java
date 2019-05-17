package com.capgemini.app.hibernate.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.app.hibernate.jpa.dao.PersonDao;
import com.capgemini.app.hibernate.jpa.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	
	@Autowired
	private PersonDao dao;

	@Override
	public void addNew(Person person) {
		dao.save(person);
		
		
	}

	@Override
	public Person getPersonById(int personId) {
		return dao.findById(personId).get();
		
	}


}
