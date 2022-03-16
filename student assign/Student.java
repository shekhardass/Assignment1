package com.te.assignmnents.common;

public class Student implements Comparable<Student> {
	String name;
	int id;
	String city;
	double marks;

	public Student(String name, int id, String city, double marks) {

		this.name = name;
		this.id = id;
		this.city = city;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		
		return 0;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", city=" + city + ", marks=" + marks + "]";
	}

}
