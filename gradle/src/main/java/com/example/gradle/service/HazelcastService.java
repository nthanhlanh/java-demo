package com.example.gradle.service;
import com.example.gradle.domain.Book;
import com.example.gradle.dto.BookRequest;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import org.springframework.stereotype.Service;

@Service
public class HazelcastService {

    private final IMap<Book, BookRequest> myMap;

    public HazelcastService(HazelcastInstance hazelcastInstance) {
        this.myMap = hazelcastInstance.getMap("myMap");
    }

    public void addData(Book key, BookRequest data) {
        myMap.put(key, data);
    }

    public BookRequest getData(Book key) {
        return myMap.get(key);
    }
}
