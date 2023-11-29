package com.springbootdemo.beans;

public class StudentBean {
	int id;
	String name;
	int age;
	int marks;
	String city;

	public int getId() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public StudentBean(int id, String name, int age, int marks, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.city = city;

	}

}
