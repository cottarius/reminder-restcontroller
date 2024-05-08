package ru.cotarius.reminderrestcontroller.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.cotarius.reminderrestcontroller.dto.UserDto;
import ru.cotarius.reminderrestcontroller.entity.User;
import ru.cotarius.reminderrestcontroller.repository.UserRepository;
import ru.cotarius.reminderrestcontroller.utils.UserMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto getUserById(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        return UserMapper.mapToUserDto(user.get());
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map(UserMapper::mapToUserDto).collect(Collectors.toList());
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        User existingUser = userRepository.findById(userDto.getId()).orElse(null);
        existingUser.setUserName(userDto.getUserName());
        existingUser.setPassword(userDto.getPassword());
        existingUser.setEmail(userDto.getEmail());
        existingUser.setFullName(userDto.getFullName());
        User savedUser = userRepository.save(existingUser);
        return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
