package com.hibernate.manytomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Course_Table")
public class CourseEntity {

	@Id
	private int courseid;
	private String coursename;

	public CourseEntity(int courseid, String coursename) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
	}

}
