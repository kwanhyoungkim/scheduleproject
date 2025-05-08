package com.example.scheduleproject.repository;

import com.example.scheduleproject.entity.Schedule;

import java.util.List;
import java.util.Optional;

public interface ScheduleRepository {
    Schedule save(Schedule schedule);
    Optional<Schedule> findById(Long id);
    List<Schedule> findAll(String date, String userId);
    Schedule update(Schedule schedule);
    void deleteById(Long id);
}
