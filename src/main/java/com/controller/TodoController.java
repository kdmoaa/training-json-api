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

@Controller
public class TodoController {

	@Autowired
	private TodoDao todoDao;
	@Autowired
	private TodoService todoService;

	@RequestMapping(value = "/todo", method = RequestMethod.GET)
	public String index() {
		return "todo/index";
	}

	@RequestMapping(value = "/todo/{id}", method = RequestMethod.GET)
	public String findTodoById(Model model, @PathVariable int id) {

		String title = todoDao.findTodo(id);

		model.addAttribute("title", title);

		return "todo/showTitle";
	}

	@RequestMapping(value = "/todo/loadTodo", method = RequestMethod.GET)
	public String loadTodo(Model model, @RequestParam(value = "id") int id) {
		TodoDto dto = todoService.load(id);
		model.addAttribute("id", dto.getId());
		model.addAttribute("title", dto.getTitle());
		model.addAttribute("description", dto.getDescription());
		model.addAttribute("staff", dto.getStaff());
		model.addAttribute("limit", dto.getLimit());

		return "todo/showTitle";

	}



}
