package ru.cotarius.reminderrestcontroller.utils;

import org.springframework.stereotype.Service;
import ru.cotarius.reminderrestcontroller.dto.RemindDto;
import ru.cotarius.reminderrestcontroller.entity.Remind;

@Service
public class ReminderMapper {

    public static RemindDto mapToRemindDto (Remind remind){
        RemindDto remindDto = new RemindDto();
        remindDto.setId(remind.getId());
        remindDto.setTitle(remind.getTitle());
        remindDto.setDescription(remind.getDescription());
        remindDto.setRemindDate(remind.getRemindDate());
        remindDto.setReminded(remind.isReminded());
        return remindDto;
    }

    public static Remind mapToRemindEntity (RemindDto remindDto){
        Remind remind = new Remind();
        remind.setId(remindDto.getId());
        remind.setTitle(remindDto.getTitle());
        remind.setDescription(remindDto.getDescription());
        remind.setRemindDate(remindDto.getRemindDate());
        remind.setReminded(remindDto.isReminded());
        return remind;
    }
}
