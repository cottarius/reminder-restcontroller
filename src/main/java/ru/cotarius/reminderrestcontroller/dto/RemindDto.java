package ru.cotarius.reminderrestcontroller.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RemindDto {

    private Long id;

    private String title;

    private String description;

    private LocalDateTime remindDate;

    private boolean isReminded;
}
