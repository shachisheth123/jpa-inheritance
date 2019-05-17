package com.capgemini.app.hibernate.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.app.hibernate.jpa.service.PersonService;
import com.capgemini.app.hibernate.jpa.entity.Person;

@RestController
public class PersonController {

	@Autowired
	private PersonService service;

	@RequestMapping("/hello")
	public Person sayHello() {
		Person person = new Person(101, "shachi");
		service.addNew(person);
		return person;
	}
	
	@RequestMapping("/list")
	public Person show() {
		return service.getPersonById(101);
	}
}