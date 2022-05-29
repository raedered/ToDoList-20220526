package com.springboot.todolist.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ToDoListResppDto {
	private int id;
	private int usercode;
	private String content;
}
