package com.twm.pomometer;

import java.util.Date;

public class Result {

	private String goal;
	
	private String notes;
	
	private int duration;
	
	private java.util.Date started_at;
	
	private java.util.Date ended_at;

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public java.util.Date getStartedAt() {
		return started_at;
	}

	public void setStartedAt(java.util.Date started_at) {
		this.started_at = started_at;
	}

	public java.util.Date getEndedAt() {
		return ended_at;
	}

	public void setEndedAt(java.util.Date ended_at) {
		this.ended_at = ended_at;
	}
	
	public Result(String goal, String notes, int duration, java.util.Date started_at, java.util.Date ended_at){
		setGoal(goal);
		setNotes(notes);
		setDuration(duration);
		setStartedAt(started_at);
		setEndedAt(ended_at);
	}
}
