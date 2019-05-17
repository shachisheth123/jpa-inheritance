package com.capgemini.manytomany.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Project")
public class Project {

	@Id
	@Column(name = "project_id")
	private int projectId;

	@Column(name = "project_name")
	private String projectName;
	
	@ManyToMany
	private Set<Person> person;

	public Project(int projectId, String projectName, Set<Person> person) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.person = person;
	}

	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Project(int projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
	}

	
	// public Set<Person> getPerson() { return person; }
	

	public void setPerson(Set<Person> person) {
		this.person = person;
	}

	

	
	 public int getProjectId() { return projectId; }
	 

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	
	 public String getProjectName() { return projectName; }
	 
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", person=" + person + "]";
	}
	
}
