package com.mockito.mvc.service;

import java.util.List;
// Talks to Application

//Create TodoServiceStub
//Test TodoBusinessImpl using TodoServiceStub
public interface TodoService {
	public List<String> retrieveTodos(String user);
}
