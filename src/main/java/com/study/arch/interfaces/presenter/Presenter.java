package com.study.arch.interfaces.presenter;

public interface Presenter <T, S> {
    S present(T response);
}
