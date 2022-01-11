package train2middle.service;

import train2middle.entity.User;
import train2middle.entity.UserDto;

import java.util.List;

public interface UserService {

    User getById(Long userId);

    List<User> getAll();

    UserDto create(UserDto userDto);

    boolean delete(Long id);
}
