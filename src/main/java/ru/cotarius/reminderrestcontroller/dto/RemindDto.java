package ru.cotarius.reminderrestcontroller.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RemindDto {

    private Long id;

    private String title;

    private String description;

    private LocalDateTime remindDate;

    private boolean isReminded;
}
