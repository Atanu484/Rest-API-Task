package com.example.hometask.controller;

import com.example.hometask.model.Name;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @PostMapping("/name")
    public ResponseEntity<Name> createFullName(@RequestBody Name name) {
        String fullName = name.getFirstName() + " " + name.getLastName();
        name.setFullName(fullName);
        return new ResponseEntity<>(name, HttpStatus.OK);
    }
}
