package com.twm.pomometer;

public class Task {

	private String name;
	
	private String description;
	
	private int effort;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getEffort() {
		return effort;
	}

	public void setEffort(int effort) {
		this.effort = effort;
	}
	
	public Task(String name, String description, int effort){
		setName(name);
		setDescription(description);
		setEffort(effort);
	}
}
