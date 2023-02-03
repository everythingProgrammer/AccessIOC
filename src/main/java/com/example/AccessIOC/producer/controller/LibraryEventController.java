package com.example.AccessIOC.producer.controller;


import com.example.AccessIOC.producer.domain.LibraryEvent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryEventController {

    @PostMapping("/v1/libraryevent")
    public ResponseEntity<LibraryEvent> postLibraryEvent(@RequestBody LibraryEvent libevent){

        // invoke kafka producer
        System.out.println("Recieved");
        return   ResponseEntity.status(HttpStatus.CREATED).body(libevent);
    }
}
