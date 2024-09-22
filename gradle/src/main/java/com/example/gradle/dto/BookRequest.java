package com.example.gradle.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookRequest {

    private Integer id;
    private String author;
    private String isbn;
    
	public BookRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
