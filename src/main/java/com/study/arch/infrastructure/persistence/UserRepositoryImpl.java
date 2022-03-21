package com.study.arch.infrastructure.persistence;

import com.study.arch.domain.user.User;
import com.study.arch.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public List<User> findAll() {
        return Collections.singletonList(User.builder()
                .id(1L)
                .name("dave")
                .createdAt(LocalDateTime.now())
                .build());
    }
}
