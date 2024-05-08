package ru.cotarius.reminderrestcontroller.utils;

import org.springframework.stereotype.Service;
import ru.cotarius.reminderrestcontroller.dto.UserDto;
import ru.cotarius.reminderrestcontroller.entity.User;

@Service
public class UserMapper {
    public static User mapToUser(UserDto userDto){
        User user = new User();
        user.setId(userDto.getId());
        user.setUserName(userDto.getUserName());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setFullName(userDto.getFullName());
        return user;
    }

    public static UserDto mapToUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUserName(user.getUserName());
        userDto.setPassword(user.getPassword());
        userDto.setEmail(user.getEmail());
        userDto.setFullName(user.getFullName());
        return userDto;
    }
}
