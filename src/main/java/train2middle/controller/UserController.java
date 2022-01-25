package train2middle.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import train2middle.controller.api.UserApi;
import train2middle.model.entity.User;
import train2middle.model.dto.UserDto;
import train2middle.service.UserServiceImpl;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {

    private final UserServiceImpl userService;

    @Override
    public User getById(String userId) {
        return userService.getById(Long.valueOf(userId));
    }

    @Override
    public List<User> getAll() {
        return userService.getAll();
    }

    @Override
    public UserDto create(UserDto userDto) {
        return userService.create(userDto);
    }

    @Override
    public boolean delete(String userId) {
        return userService.delete(Long.valueOf(userId));
    }
}
