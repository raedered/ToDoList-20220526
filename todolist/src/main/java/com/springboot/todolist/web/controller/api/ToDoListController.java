package com.springboot.todolist.web.controller.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.todolist.domain.ToDoList;
import com.springboot.todolist.domain.ToDoListRepository;
import com.springboot.todolist.service.ToDoListService;
import com.springboot.todolist.web.dto.ToDoListInsertReqDto;
import com.springboot.todolist.web.dto.ToDoListUpdateReqDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ToDoListController {
	
	private final ToDoListService toDoListService;
	
	//리스트 전체 불러오기
	@GetMapping("todo/list")
	public ResponseEntity<?> getListAll(int usercode) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	// 리스트 추가
	@PostMapping("/todo")
	public ResponseEntity<?> addToDo(@Valid @RequestBody ToDoListInsertReqDto toDoListInsertReqDto) {
		int toDoList = toDoListService.createToDoList(toDoListInsertReqDto);
		return new ResponseEntity<>(toDoList, HttpStatus.OK);
	}
	
	// 리스트 수정
	@PutMapping("/todo/{id}")
	public ResponseEntity<?> modifiToDo(@PathVariable int id, @Valid @RequestBody ToDoListUpdateReqDto toDoListUpdateReqDto ) {
		int resultId = toDoListService.updateToDoList(id, toDoListUpdateReqDto);
		return new ResponseEntity<>(resultId, HttpStatus.OK);
	}
	
	// 리스트 삭제
	@DeleteMapping("/todo/{id}")
	public ResponseEntity<?> removeToDo(@PathVariable int id){
		int resultId = toDoListService.deleteToDoList(id);
		return new ResponseEntity<>(resultId, HttpStatus.OK);
	}
}
