package com.springboothibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboothibernate.dao.StudentDAO;
import com.springboothibernate.entities.Student;

@Service
@Transactional
@ComponentScan({ "com.springboothibernate.dao" })
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;

	public List<Student> findAll() {
		return studentDAO.findAll();
	}

	public Student findById(final int id) {
		return studentDAO.findById(id);
	}

	public void save(final Student student) {
		studentDAO.save(student);
	}

	public void update(final Student student) {
		studentDAO.update(student);
	}

	public void delete(final int id) {
		Student student = studentDAO.findById(id);
		if (student != null) {
			studentDAO.delete(student);
		}
	}
}