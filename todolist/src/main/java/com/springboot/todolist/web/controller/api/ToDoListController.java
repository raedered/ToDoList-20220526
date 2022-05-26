package com.springboot.todolist.web.controller.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.todolist.domain.todolist.ToDoList;
import com.springboot.todolist.domain.todolist.ToDoListRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ToDoListController {
	
	private final ToDoListRepository toDoListRepository;
	
	//리스트 전체 불러오기
	@GetMapping("todo/list")
	public ResponseEntity<?> getListAll() {
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	// 리스트 추가
	@PostMapping("/todo")
	public ResponseEntity<?> addToDo(@RequestBody ToDoList toDoList) {
		
		toDoListRepository.insertToDoList(toDoList);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	// 리스트 수정
	@PutMapping("/todo/{id}")
	public ResponseEntity<?> modifiToDo() {
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	// 리스트 삭제
	@DeleteMapping("/todo/{id}")
	public ResponseEntity<?> removeToDo(){
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
