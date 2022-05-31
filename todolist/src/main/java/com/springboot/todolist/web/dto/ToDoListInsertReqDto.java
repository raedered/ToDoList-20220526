package com.springboot.todolist.web.dto;

import javax.validation.constraints.NotBlank;

import com.springboot.todolist.domain.ToDoList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ToDoListInsertReqDto {
	private int usercode;
	@NotBlank
	private String content;
	
	public ToDoList toToDoListEntity() {
		return ToDoList.builder()
				.usercode(usercode)
				.content(content)
				.build();
	}
}
