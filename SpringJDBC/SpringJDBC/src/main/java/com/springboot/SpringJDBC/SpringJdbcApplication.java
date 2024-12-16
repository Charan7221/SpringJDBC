package com.springboot.SpringJDBC;

import com.springboot.SpringJDBC.Model.Student;
import com.springboot.SpringJDBC.servi.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);
		Student student = context.getBean(Student.class);
		student.setRollNo(21);
		student.setName("sai");
		student.setMarks(89);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(student);

		List<Student> students = service.getAllStudents();
		System.out.println(students);

	}

}
