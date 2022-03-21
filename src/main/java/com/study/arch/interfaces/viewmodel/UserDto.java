package com.study.arch.interfaces.viewmodel;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UserDto {

    private Long id;
    private String name;
    private LocalDateTime createdAt;
}
