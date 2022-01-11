package train2middle.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import train2middle.entity.User;
import train2middle.entity.UserDto;

import java.util.List;

@RequestMapping("/users")
public interface UserApi {

    @GetMapping("/{id}")
    User getById(@PathVariable("id") String userId);

    @GetMapping("/all")
    List<User> getAll();

    @PostMapping
    UserDto create(@RequestBody UserDto userDto);

    @DeleteMapping("/{id}")
    boolean delete(@PathVariable("id") String userId);
}
