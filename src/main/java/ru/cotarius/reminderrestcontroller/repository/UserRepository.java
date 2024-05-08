package ru.cotarius.reminderrestcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.cotarius.reminderrestcontroller.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
