package com.springboot.todolist.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.todolist.domain.ToDoList;
import com.springboot.todolist.domain.ToDoListRepository;
import com.springboot.todolist.web.dto.ToDoListInsertReqDto;
import com.springboot.todolist.web.dto.ToDoListUpdateReqDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ToDoListServiceImpl implements ToDoListService{
	private final ToDoListRepository toDoListRepository;

	@Override
	public List<ToDoList> getToDoListAll() {
		List<ToDoList> getListAll = new ArrayList<ToDoList>();
		
		toDoListRepository.getToDoListAll();
		return getListAll;
	}

	@Override
	public int createToDoList(ToDoListInsertReqDto toDoListInsertReqDto) {
		ToDoList toDoList = toDoListInsertReqDto.toToDoListEntity();
		
		int result = toDoListRepository.insertToDoList(toDoList);
		
		if(result > 0) {
			return toDoList.getId();
		}
		
		return 0;
	}

	@Override
	public int updateToDoList(int id, ToDoListUpdateReqDto toDoListUpdateReqDto) {
		ToDoList toDoList = toDoListUpdateReqDto.toToDoListMstEntity(id);
		return toDoListRepository.updateToDoList(toDoList) > 0 ? id : 0;
	}

	@Override
	public int deleteToDoList(int id) {
		return toDoListRepository.deleteToDoList(id) > 0 ? id : 0;
	}
}
