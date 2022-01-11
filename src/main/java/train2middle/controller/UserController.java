package train2middle.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import train2middle.entity.User;
import train2middle.entity.UserDto;
import train2middle.service.UserServiceImpl;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController implements UserApi{

    private final UserServiceImpl userService;

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") String userId) {
        return userService.getById(Long.valueOf(userId));
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping
    public UserDto create(@RequestBody UserDto userDto) {
        return userService.create(userDto);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") String userId) {
        return userService.delete(Long.valueOf(userId));
    }
}
