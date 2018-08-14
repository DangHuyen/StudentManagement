package com.springboothibernate.entities;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Courses")

public class Course {
	@Id
	@Column(name = "course_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "course_name")
	private String name;
	
	@Column(name="course_instructor")
	private String course_instructor;
	
	@Column(name="course-openedday")
	private Date course_openedday;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse_instructor() {
		return course_instructor;
	}

	public void setCourse_instructor(String course_instructor) {
		this.course_instructor = course_instructor;
	}

	public Date getCourse_openedday() {
		return course_openedday;
	}

	public void setCourse_openedday(Date course_openedday) {
		this.course_openedday = course_openedday;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Course: " + this.id + "  name: " + this.name + "  course instructor:" + this.course_instructor
				+ "  course opened day: " + this.course_openedday;
	}

	
}
