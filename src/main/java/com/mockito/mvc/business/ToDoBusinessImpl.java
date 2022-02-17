package com.mockito.mvc.business;

import java.util.ArrayList;
import java.util.List;

import com.mockito.mvc.service.TodoService;
//ToDoBusinessImpl is called System Under Test (SUT)

//TodoService Dependency

//STUB is a sample implementation for todoService
public class ToDoBusinessImpl {
	private TodoService todoService;
	
	public ToDoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	public List<String> retrieveTodosRelatedToSpring(String user){
		List<String> filteredTodos = new ArrayList<String>();
		List<String> allTodos = todoService.retrieveTodos(user);
		for (String todo : allTodos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
}
