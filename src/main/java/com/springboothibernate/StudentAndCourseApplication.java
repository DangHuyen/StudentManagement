package com.springboothibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.springboothibernate.entities.Student;
import com.springboothibernate.service.StudentService;
@SpringBootApplication
@ComponentScan({ "com.springboothibernate.service" })
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class,
    DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class StudentAndCourseApplication implements CommandLineRunner{
  public static void main(String[] args) {
    SpringApplication.run(StudentAndCourseApplication.class, args);
  }
  
  @Autowired
  private StudentService studentService;
  
@Override
public void run(String... args) throws Exception {
//	 TODO Auto-generated method stub
	
	Student student = studentService.findById(1);
	//student.toString();
	System.out.println(student.toString());
	
}
}