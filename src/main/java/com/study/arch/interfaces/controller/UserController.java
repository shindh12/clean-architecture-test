package com.study.arch.interfaces.controller;

import com.study.arch.interfaces.viewmodel.ShowUserViewModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.OK;

@RequestMapping("/user")
public interface UserController {

    @ResponseStatus(OK)
    @GetMapping
    ResponseEntity<ShowUserViewModel> showUsers();
}
