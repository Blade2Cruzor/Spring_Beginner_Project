package com.todolist.TodoListApplication.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.TodoListApplication.model.TodoItem;
import com.todolist.TodoListApplication.repo.TodoRepo;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "/todo")
public class TodoController
{
	@Autowired
	private TodoRepo todorepo;
	
	@GetMapping
	public List<TodoItem> findAll()
	{
		return todorepo.findAll();
	}
	
	@PostMapping
	public TodoItem save(@Valid @NotNull @RequestBody TodoItem todoItem)
	{
		return todorepo.save(todoItem);
	}
	
	@PutMapping
	public TodoItem update(@Valid @NotNull @RequestBody TodoItem todoItem)
	{
		return todorepo.save(todoItem);
	}

}