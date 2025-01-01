package com.todolist.TodoListApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class TodoItem
{
	private long taskId;
	@NotBlank
	private String taskName;
	private Boolean taskCompleted;
	
	public TodoItem()
	{
		super();
	}
	
	public TodoItem(long taskId, String taskName, Boolean taskCompleted)
	{
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskCompleted = taskCompleted;
	}

	@Id
	@GeneratedValue
	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Boolean getTaskCompleted() {
		return taskCompleted;
	}

	public void setTaskCompleted(Boolean taskCompleted) {
		this.taskCompleted = taskCompleted;
	}

}
