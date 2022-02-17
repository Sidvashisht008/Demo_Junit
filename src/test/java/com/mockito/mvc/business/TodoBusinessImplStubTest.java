package com.mockito.mvc.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.mockito.mvc.service.TodoService;
import com.mockito.mvc.service.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void test() {
		TodoService todoService = new TodoServiceStub();
		ToDoBusinessImpl todoBusinessImpl = new ToDoBusinessImpl(todoService);
		List<String> filtered = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals("Learn Spring",filtered.get(0));
	}

}
