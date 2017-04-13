package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.TodoDao;
import com.dto.TodoDto;
import com.service.TodoService;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodoController {

	@Autowired
	private TodoDao todoDao;
	@Autowired
	private TodoService todoService;

	@RequestMapping(value = "/todo", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("todo/index");
	}

	@RequestMapping(value = "/todo/{id}", method = RequestMethod.GET)
	public ModelAndView findTodoById(@PathVariable int id) {

		String title = todoDao.findTodo(id);

		return new ModelAndView("todo/showTitle", "title", title);
	}

	@RequestMapping(value = "/todo/loadTodo", method = RequestMethod.GET)
	public ModelAndView loadTodo(@RequestParam(value = "id") int id) {
		TodoDto dto = todoService.load(id);

		return new ModelAndView("todo/showTitle", "model", dto);

	}



}
