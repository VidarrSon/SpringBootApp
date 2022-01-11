package train2middle.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import train2middle.entity.User;
import train2middle.entity.UserDto;
import train2middle.service.UserServiceImpl;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController implements UserApi{

    private final UserServiceImpl userService;

    public User getById(String userId) {
        return userService.getById(Long.valueOf(userId));
    }

    public List<User> getAll() {
        return userService.getAll();
    }

    public UserDto create(UserDto userDto) {
        return userService.create(userDto);
    }

    public boolean delete(String userId) {
        return userService.delete(Long.valueOf(userId));
    }
}
