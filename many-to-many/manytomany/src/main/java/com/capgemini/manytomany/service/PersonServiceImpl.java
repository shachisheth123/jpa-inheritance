package com.capgemini.manytomany.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.manytomany.dao.PersonDao;
import com.capgemini.manytomany.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao dao;
	
	@Override
	public Set<Person> addNew(Set<Person> person) {
		dao.saveAll(person);
		return person;
		
	}

	@Override
	public Person getPersonById(int personId) {
	return dao.findById(personId).get();
		
	}

	/*
	 * @Override public Person getPersonById(int personId) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public Set<Person> oneToManyAddition(Set<Person> person) { return
	 * person; // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
