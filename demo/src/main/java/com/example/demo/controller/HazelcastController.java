package com.example.demo.controller;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.BookRequest;
import com.example.demo.service.BookService;
import com.example.demo.service.HazelcastService;

@RestController
@RequestMapping("/api/v1/hazelcast")
public class HazelcastController {

	@Autowired
    private HazelcastService hazelcastService;
	
	@Autowired
    private BookService bookService;

    @PostMapping("/add")
    public String addData(@RequestParam String key, @RequestBody BookRequest data) {
    	UUID id = UUID.fromString(key);
    	var book=bookService.getBookById(id);
        hazelcastService.addData(book.get(), data);
        return "Data added!";
    }

    @GetMapping("/get")
    public BookRequest getData(@RequestParam String key) {
    	UUID id = UUID.fromString(key);
    	var book=bookService.getBookById(id);
        return hazelcastService.getData(book.get());
    }
}
