package train2middle.controller;

import train2middle.entity.User;
import train2middle.entity.UserDto;

import java.util.List;

public interface UserApi {
    User getById(String userId);
    List<User> getAll();
    UserDto create(UserDto userDto);
    boolean delete(String userId);
}
