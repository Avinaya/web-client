package com.berrybytes.test.controller;


import com.berrybytes.test.model.User;
import com.berrybytes.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/users")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.status(HttpStatus.OK).body(testService.getUserData());

    }
}
