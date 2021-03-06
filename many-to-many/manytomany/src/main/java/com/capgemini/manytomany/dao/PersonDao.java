package com.capgemini.manytomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.manytomany.entity.Person;


@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}
