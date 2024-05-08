package ru.cotarius.reminderrestcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.cotarius.reminderrestcontroller.entity.Remind;

public interface RemindRepository extends JpaRepository<Remind, Long> {
}
