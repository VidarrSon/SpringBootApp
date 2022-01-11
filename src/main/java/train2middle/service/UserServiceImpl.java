package train2middle.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import train2middle.entity.User;
import train2middle.entity.UserDto;
import train2middle.exception.UserNotFoundException;
import train2middle.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("There is no user with id = " + userId));
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public UserDto create(UserDto userDto) {
        User user = toEntity(userDto);
        return toDto(userRepository.save(user));
    }

    @Override
    public boolean delete(Long id) {
        return userRepository.deleteUserById(id) > 0;
    }

    private User toEntity (UserDto userDto) {
        return User.builder()
                .name(userDto.getName())
                .email(userDto.getEmail())
                .address(userDto.getAddress())
                .build();
    }

    private UserDto toDto (User user) {
        return UserDto.builder()
                .name(user.getName())
                .email(user.getEmail())
                .address(user.getAddress())
                .build();
    }
}
