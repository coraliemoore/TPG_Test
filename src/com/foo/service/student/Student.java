package com.foo.service.student;

import java.util.Comparator;

public class Student {

	private int id;
	
	private String name;
	
	private Double gpa;
	
	public Student(){
	}
	
	public Student(int id, String name, Double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
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
	
	public Double getGpa() {
		return gpa;
	}
	
	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	public static final Comparator<Student> GPA_NAME_ORDER = new Comparator<Student>() {
		public int compare(Student s1, Student s2) {
			int gpaCompare = s2.getGpa().compareTo(s1.getGpa());
			if (gpaCompare != 0) {
				return gpaCompare;
			} else {
				return s1.getName().compareTo(s2.getName());	
			}
		}
	};
}
