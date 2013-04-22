package com.twm.pomometer;

public class Project {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Project(){
		this("Test Name");
	}
	
	public Project(String name){
		setName(name);
	}
}
