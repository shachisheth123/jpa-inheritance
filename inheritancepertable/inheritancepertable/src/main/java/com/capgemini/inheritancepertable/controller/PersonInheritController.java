package com.capgemini.inheritancepertable.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inheritancepertable.entity.Contract_Employee;
import com.capgemini.inheritancepertable.entity.Person;
import com.capgemini.inheritancepertable.entity.RegularEmployee;
import com.capgemini.inheritancepertable.service.PersonService;

@RestController
public class PersonInheritController {
	@Autowired
	PersonService service;

	@RequestMapping("/showPersons")
	public Set<Person> regularEmp() {

		Set<Person> persons = new HashSet<>();
		persons.add(new Contract_Employee(101, "shachi", "capgemini", 500.0, 2));
		persons.add(new Contract_Employee(102, "rasika", "infosys", 500.0, 2));
		persons.add(new RegularEmployee(101, "shachi", "symantec", 30000));
		persons.add(new RegularEmployee(102, "riddhi", "tcs", 30000));
		return persons;
	}

}
