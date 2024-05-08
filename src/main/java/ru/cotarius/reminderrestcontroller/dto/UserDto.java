package ru.cotarius.reminderrestcontroller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;
    private String userName;
    private String fullName;
    private String password;
    private String email;
}
