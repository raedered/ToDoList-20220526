package com.springboot.todolist.service;

import java.util.List;

import com.springboot.todolist.domain.todolist.ToDoList;
import com.springboot.todolist.web.dto.ToDoListInsertReqDto;
import com.springboot.todolist.web.dto.ToDoListUpdateReqDto;

public interface ToDoListService {
	public List<ToDoList> getToDoListAll();
	public int createToDoList(ToDoListInsertReqDto toDoListInsertReqDto);
	public int updateToDoList(int id, ToDoListUpdateReqDto toDoListUpdateReqDto);
	public int deleteToDoList(int id);
	
}
