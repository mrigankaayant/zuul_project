package com.zuul.model;

public class Student {
	
	private String name;
	private String location;
	private String skill;
	
	public Student(){
		
	}
	
	public Student(String name,String location,String skill) {
		this.name = name;
		this.location = location;
		this.skill = skill;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
}
