package com.todolist.TodoListApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todolist.TodoListApplication.model.TodoItem;


public interface TodoRepo extends JpaRepository<TodoItem, Long>
{

}