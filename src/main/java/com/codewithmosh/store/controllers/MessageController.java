package com.codewithmosh.store.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.codewithmosh.store.entities.Message;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MessageController {
    @RequestMapping("/hello")
    public Message sayHello() {
        return new Message("Hello");
    }
    
}
