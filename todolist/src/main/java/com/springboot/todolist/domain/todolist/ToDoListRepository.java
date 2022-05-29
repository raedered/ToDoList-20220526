package com.springboot.todolist.domain.todolist;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ToDoListRepository {
	public List<ToDoList> getToDoListAll(); 
	public int insertToDoList(ToDoList toDoList);
	public int updateToDoList(ToDoList toDoList);
	public int deleteToDoList(int id);
	
}
