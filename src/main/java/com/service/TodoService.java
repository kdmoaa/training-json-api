package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.TodoDto;
import com.mapper.TodoMapper;

@Service
public class TodoService {

	@Autowired
	private TodoMapper todoMapper;

	public TodoDto load(int id) {
		return todoMapper.loadTodo(id);
	}

}
