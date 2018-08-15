package com.springboothibernate;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.springboothibernate.entities.Course;
import com.springboothibernate.entities.Student;
import com.springboothibernate.service.CourseService;
//import com.springboothibernate.service.CourseService;
import com.springboothibernate.service.StudentService;
@SpringBootApplication

@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class,
    DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class StudentAndCourseApplication implements CommandLineRunner{
  public static void main(String[] args) {
    SpringApplication.run(StudentAndCourseApplication.class, args);
  }

	@Autowired
	private StudentService studentService;
	@Autowired
	private CourseService courseService;
  
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	Student student = studentService.findById(1);
	student.toString();
	System.out.println(student.toString());
	
	
	Course course333 = courseService.findById(1);
	System.out.println(course333.toString());
	
	//CourseService courseService = new CourseService();
	/*List<Course> course = courseService.findAll();
	for (Course course2 : course) {
		System.out.println(course2.toString());
	}*/
	
}
}