package com.study.arch.application.usecase;

import com.study.arch.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ShowUserServiceImpl implements ShowUserService{

    private final UserRepository userRepository;

    @Override
    public ShowUserResponseModel show(final ShowUserRequestModel request) {
        return new ShowUserResponseModel(userRepository.findAll());
    }
}
