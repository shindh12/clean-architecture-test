package com.study.arch.domain.user;

import java.util.List;

public interface UserRepository {

    List<User> findAll();
}
