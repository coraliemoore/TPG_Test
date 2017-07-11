package com.foo.service.student.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.foo.service.student.Student;
import com.foo.service.student.StudentService;

public class StudentServiceTest {

	private List<Student> studentList;
	
	@Before
	public void setUp() throws Exception {
		studentList = new ArrayList<Student>();
		studentList.add(new Student(33, "Tina", 3.68));
		studentList.add(new Student(85, "Louis", 3.85));
		studentList.add(new Student(56, "Samil", 3.75));
		studentList.add(new Student(19, "Samar", 3.75));
		studentList.add(new Student(22, "Lorry", 3.76));
	}

	@Test
	public void getStudentList_testSorted() {
		StudentService studentService = new StudentService();
		List<Student> sortedList = studentService.getStudentList(studentList);
		
		assertEquals(5, sortedList.size());
		assertEquals("Louis", sortedList.get(0).getName());
		assertEquals("Lorry", sortedList.get(1).getName());
		assertEquals("Samar", sortedList.get(2).getName());
		assertEquals("Samil", sortedList.get(3).getName());
		assertEquals("Tina", sortedList.get(4).getName());
	}

}
