package ru.cotarius.reminderrestcontroller.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.cotarius.reminderrestcontroller.dto.UserDto;
import ru.cotarius.reminderrestcontroller.repository.UserRepository;

import java.util.List;

@Service
public interface UserService {
    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}
