package com.capgemini.inheritancepertable.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CONTRACT_EMPLOYEE")
public class Contract_Employee extends MyEmployee {

	private double payPerHour;
	private int hours;

	public Contract_Employee() {
		super();

	}

	public Contract_Employee(int personId, String name, String company, double payPerHour, int hours) {
		super(personId, name, company);
		this.payPerHour = payPerHour;
		this.hours = hours;

	}

	public double getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(double payPerHour) {
		this.payPerHour = payPerHour;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

}
