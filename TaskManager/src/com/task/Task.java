package com.task;

import java.io.Serializable;
import java.time.LocalDate;

public class Task implements Serializable {
	
//	 * You can create a class Task with fields like taskId, taskName,
//	 * description, taskDate, status, active. 
//	 * 
//	 * taskId should be unique and generated
//	 * automatically. 
//	 * 
//	 * status should be either PENDING, IN PROGRESS or COMPLETED.
//	 * 
//	 * 
//	 * active should be either true or false. 
//	 * 
//	 * Deleted task will have active=false
//	 * 
//	 * Newly added task should have default status as PENDING and active=true 
	
	private int taskId;
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private Status taskStatus;
	private boolean active;
	
	public static int taskidcounter;
	
	static
	{
		taskidcounter=101;
	}
	
	
	public Task(String taskName, String description, LocalDate taskDate)
	{
		super();
		this.taskId = taskidcounter;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.taskStatus = Status.PENDING;
		this.active = true;
		taskidcounter++;
	}
	
	


	public int getTaskId() {
		return taskId;
	}




	public String getTaskName() {
		return taskName;
	}




	public String getDescription() {
		return description;
	}




	public LocalDate getTaskDate() {
		return taskDate;
	}




	public Status getTaskStatus() {
		return taskStatus;
	}




	public boolean isActive() {
		return active;
	}




	public static int getTaskidcounter() {
		return taskidcounter;
	}




	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}




	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}




	public void setTaskStatus(Status taskStatus) {
		this.taskStatus = taskStatus;
	}




	public void setActive(boolean active) {
		this.active = active;
	}




	public static void setTaskidcounter(int taskidcounter) {
		Task.taskidcounter = taskidcounter;
	}




	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description + ", taskDate="
				+ taskDate + ", taskStatus=" + taskStatus + ", active=" + active + "] \n";
	}
	
	
	
	
	
	
	

}
