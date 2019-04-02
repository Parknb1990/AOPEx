package com.javalec.ex;

public class Cats {
	
	private String name;
	private int age;
	private String color;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void getCatsInfo() {
		System.out.println("cats name : "+getName());
		System.out.println("cats age : "+getAge());
		System.out.println("cats color : "+getColor());
	}

}
