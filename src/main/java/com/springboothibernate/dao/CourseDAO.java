package com.springboothibernate.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboothibernate.entities.Course;
import com.springboothibernate.entities.Student;

@Repository(value = "courseDAO")
@Transactional(rollbackFor = Exception.class)
@ComponentScan({ "com.springboothibernate" })

public class CourseDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(final Course course) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(course);
	}
	
	public void update(final Course course) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(course);
	}

	public Course findById(final int id) {
		Session session = this.sessionFactory.getCurrentSession();
		//String sql="FROM Courses Where course_id=1";
		return session.get(Course.class, id);
		//return (Course) session.createQuery(sql);
	}

	public void delete(final Course course) {
		Session session = this.sessionFactory.getCurrentSession();
		session.remove(course);
	}

	public List<Course> findAll() {
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM Course", Course.class).getResultList();
	}
}