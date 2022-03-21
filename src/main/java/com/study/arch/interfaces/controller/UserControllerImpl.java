package com.study.arch.interfaces.controller;

import com.study.arch.application.usecase.ShowUserRequestModel;
import com.study.arch.application.usecase.ShowUserResponseModel;
import com.study.arch.application.usecase.ShowUserService;
import com.study.arch.shared.Presenter;
import com.study.arch.interfaces.viewmodel.ShowUserViewModel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserControllerImpl implements UserController {
    private final ShowUserService service;
    private final Presenter<ShowUserResponseModel, ShowUserViewModel> presenter;

    @Override
    public ResponseEntity<ShowUserViewModel> showUsers() {
        final var response = service.show(ShowUserRequestModel.INSTANCE);
        return ResponseEntity.ok(presenter.present(response));
    }
}
