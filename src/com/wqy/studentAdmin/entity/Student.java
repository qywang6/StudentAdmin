package com.wqy.studentAdmin.entity;

public class Student {
	private String name;
	private int age;
	private boolean gender;
	private String number;
	
	public Student(String name,int age,boolean gender,String number){
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.number = number;
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
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String toString(){
		return "编号："+number+"姓名："+name+",年龄"+age+"，性别"+(gender?"男":"女");
	}
}
