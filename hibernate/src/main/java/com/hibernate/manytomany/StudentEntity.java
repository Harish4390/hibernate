package com.hibernate.manytomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Table")
public class StudentEntity {

	@Id
	private int id;
	private String name;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "STUDENT_COURSE", joinColumns = @JoinColumn(name = "STD_ID"), inverseJoinColumns = @JoinColumn(name = "COURS_ID"))
	private Set<CourseEntity> course;

	public StudentEntity(int id, String name, Set<CourseEntity> course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}

}
