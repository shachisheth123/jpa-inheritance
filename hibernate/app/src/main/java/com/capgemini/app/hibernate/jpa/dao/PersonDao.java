package com.capgemini.app.hibernate.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.app.hibernate.jpa.entity.Person;

@Repository
public interface PersonDao extends JpaRepository <Person,Integer>  {

}
