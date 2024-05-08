package ru.cotarius.reminderrestcontroller.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "remind")
public class Remind implements BaseEntity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @Column(name = "remind_date")
    private LocalDateTime remindDate;

    private boolean isReminded;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
