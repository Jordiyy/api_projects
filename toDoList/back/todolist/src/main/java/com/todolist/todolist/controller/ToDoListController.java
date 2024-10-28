package com.todolist.todolist.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.todolist.models.DTO.MessageDTO;
import com.todolist.todolist.models.DTO.TaskDTO;
import com.todolist.todolist.models.entity.Task;
import com.todolist.todolist.models.entity.User;
import com.todolist.todolist.models.service.ITaskService;
import com.todolist.todolist.models.service.IUserService;
import com.todolist.todolist.models.service.TaskServiceImp;
import com.todolist.todolist.models.service.UserServiceImp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/todolist")
public class ToDoListController {

	@Autowired
	private UserServiceImp userService;

	@Autowired
	private TaskServiceImp taskService;
    
	@GetMapping("/data")
	public MessageDTO message() {
		return new MessageDTO(LocalDateTime.now(), "Hola mundo!!");
	}

	@GetMapping("/all")
	public List<Task> allTasks() {
		return taskService.findAllTasks();
	}

	@GetMapping("/allUsers")
	public List<User> allUsers() {
		return userService.getAllUser();
	}
	

	@GetMapping("/task/{id}")
	public Task getTaskById(@PathVariable int id) {
		return taskService.findByTaskId(id);
	}

	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {		
		return userService.save(user);
	}

	@PostMapping("/addTask")
	public Task addTask(@RequestBody Task task) {
		return taskService.save(task);
	}
	
	
}