package com.foo.service.student;

import java.util.Collections;
import java.util.List;

public class StudentService {
	
	public List<Student> getStudentList(List<Student> studentList) {	
		if(studentList != null){
			Collections.sort(studentList, Student.GPA_NAME_ORDER);
		}
		return studentList;
	}
}
