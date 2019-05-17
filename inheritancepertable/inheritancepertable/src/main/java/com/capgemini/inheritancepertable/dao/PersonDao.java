package com.capgemini.inheritancepertable.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.inheritancepertable.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer>{

}
