package com.study.arch.interfaces.viewmodel;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class ShowUserViewModel {
    private final List<UserDto> users;
}
