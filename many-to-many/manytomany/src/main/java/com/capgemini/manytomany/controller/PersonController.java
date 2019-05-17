package com.capgemini.manytomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.manytomany.entity.Person;
import com.capgemini.manytomany.entity.Project;
import com.capgemini.manytomany.service.PersonService;


@RestController
public class PersonController {

	@Autowired
	PersonService service;

	@RequestMapping("/profile")
	public Set<Person> sayHello() {
		
		
		Set<Project> projects = new HashSet<>();
		projects.add(new Project(101, "java"));
		projects.add(new Project(102, ".net"));
		
		Set<Person> persons = new HashSet<>();
		persons.add(new Person(201, "shachi",projects));
		persons.add(new Person(202, "rasika",projects));
		

		service.addNew(persons);

		return persons;
	}
	
	@RequestMapping("/show")
	public Set<Person> displayDetails()
	{

		Set<Person> personList = new HashSet<Person>();

		Project project1 = new Project(102, "java");
		Project project2 = new Project(103, "python");
		Project project3 = new Project(104, ".net");
		Project project4 = new Project(105, "ruby");

		Set<Project> projects = new HashSet<>();
		projects.add(project1);
		projects.add(project2);

		Set<Project> certifications2 = new HashSet<>();
		certifications2.add(project4);
		certifications2.add(project3);

		Person p1 = new Person(101, "shachi", projects);
		Person p2 = new Person(102, "rasika", projects);

		personList.add(p1);
		personList.add(p2);

		return personList;
		
	}
	
	@RequestMapping("/ByID")
	public Person showPerson() {
		return service.getPersonById(201);
	}

}
