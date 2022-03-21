package com.study.arch.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.time.LocalDateTime;

@Getter
@Builder
public class User {

    @NonNull
    private Long id;

    @NonNull
    private String name;
    private String email;
    private LocalDateTime createdAt;
}
