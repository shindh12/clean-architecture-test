package com.study.arch.shared;

public interface Presenter <T, S> {
    S present(T response);
}
