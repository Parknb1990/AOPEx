package com.javalec.ex;

public class Student {

	private String name;
	private int age;
	private int gradeNum;
	private int classNum;
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
	public int getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(int gradeNum) {
		this.gradeNum = gradeNum;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	
	public void getStudentInfo() {
		System.out.println("name : "+getName());
		System.out.println("age : "+getAge());
		System.out.println("gradeNum : "+getGradeNum());
		System.out.println("classNum : "+getClassNum());
		System.out.println("====================");
		
	}
}