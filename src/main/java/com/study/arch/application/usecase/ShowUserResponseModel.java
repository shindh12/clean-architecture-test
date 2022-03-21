package com.study.arch.application.usecase;

import com.study.arch.domain.user.User;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class ShowUserResponseModel {
    private final List<User> users;
}
