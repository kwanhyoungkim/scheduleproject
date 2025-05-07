package com.example.scheduleproject.service;


import com.example.scheduleproject.dto.ScheduleSaveRequestDto;
import com.example.scheduleproject.dto.ScheduleResponseDto;
import com.example.scheduleproject.entity.Schedule;
import com.example.scheduleproject.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public ScheduleResponseDto save(ScheduleSaveRequestDto schedulerequestDto) {
        Schedule schedule = new schedule(
                schedulerequestDto.getId(),
                schedulerequestDto.getUserId(),
                schedulerequestDto.getTitle(),
                schedulerequestDto.getContent(),
                schedulerequestDto.getCreatedAt(),
                schedulerequestDto.getUpdatedAt()
        );

        Schedule saveSchedule = scheduleRepository.save(schedule);

        return new ScheduleResponseDto(
                saveSchedule.getId(),
                saveSchedule.getUserId(),
                saveSchedule.getTitle(),
                saveSchedule.getContent(),
                saveSchedule.getCreatedAt(),
                saveSchedule.getUpdatedAt()
        );

    }
}
