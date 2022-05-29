package com.springboot.todolist.web.dto;



import javax.validation.constraints.NotBlank;

import com.springboot.todolist.domain.todolist.ToDoList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ToDoListUpdateReqDto {
	@NotBlank
	private String content;
	
	public ToDoList toToDoListMstEntity(int id) {
		return ToDoList.builder()
				.id(id)
				.content(content)
				.build();
	}
}
