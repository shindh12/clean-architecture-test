package com.study.arch.interfaces.presenter;

import com.study.arch.application.usecase.ShowUserResponseModel;
import com.study.arch.domain.user.User;
import com.study.arch.interfaces.viewmodel.ShowUserViewModel;
import com.study.arch.interfaces.viewmodel.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import static java.util.stream.Collectors.toList;

@RequiredArgsConstructor
@Service
public class ShowUserPresenter implements Presenter<ShowUserResponseModel, ShowUserViewModel> {
    private final Converter<User, UserDto> converter;
    @Override
    public ShowUserViewModel present(ShowUserResponseModel response) {
        final var users = response.getUsers().stream().map(converter::convert).collect(toList());
        return new ShowUserViewModel(users);
    }
}
