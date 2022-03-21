package com.study.arch.interfaces.support;

import com.study.arch.domain.user.User;
import com.study.arch.interfaces.viewmodel.UserDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserToUserDtoConverter implements Converter<User, UserDto> {
    @Override
    public UserDto convert(User source) {
        return UserDto.builder()
                .id(source.getId())
                .name(source.getName())
                .createdAt(source.getCreatedAt())
                .build();
    }
}
