package com.springboot.todolist.domain.todolist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ToDoList {
	private int id;
	private int usercode;
	private String content;
}
