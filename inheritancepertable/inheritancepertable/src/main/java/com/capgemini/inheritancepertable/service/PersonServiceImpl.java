package com.capgemini.inheritancepertable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inheritancepertable.dao.PersonDao;
import com.capgemini.inheritancepertable.entity.Person;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonDao person;
	
	@Override
	public void addNew(Person persons) {
		person.save(persons);
		
	}

}
