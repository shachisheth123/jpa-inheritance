package com.capgemini.inheritancepertable.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="REGULAR_EMPLOYEE")
public class RegularEmployee extends MyEmployee {

	private double salary;

	public RegularEmployee() {
		super();

	}

	public RegularEmployee(int personId, String name, String company , double salary) {
		super(personId, name, company);
		this.salary=salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
