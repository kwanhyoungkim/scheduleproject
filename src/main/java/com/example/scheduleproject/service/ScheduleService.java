package com.example.scheduleproject.service;


import com.example.scheduleproject.dto.ScheduleSaveRequestDto;
import com.example.scheduleproject.dto.ScheduleResponseDto;
import com.example.scheduleproject.entity.Schedule;
import com.example.scheduleproject.repository.ReCommentRepository;
import com.example.scheduleproject.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    @Autowired
    public ScheduleService(ScheduleRepository scheduleRepository){this.scheduleRepository=scheduleRepository;}

    // 일정 생성
    public static Schedule saveSchedule(Schedule schedule){return scheduleRepository.save(schedule);}


    // 일정 조회
    public List<Schedule> getAllSchedule(){return scheduleRepository.findAll();}


    // 일정 수정
    public Schedule updateSchedule(Long id){return scheduleRepository.update(id);}


    // 일정 삭제
    public void deletedSchedule(Long id){scheduleRepository.deleteById(id);}


   // public ScheduleResponseDto save(ScheduleSaveRequestDto schedulerequestDto) {
   //     Schedule schedule = new schedule(
   //             schedulerequestDto.getId(),
   //             schedulerequestDto.getUserId(),
   //             schedulerequestDto.getTitle(),
   //             schedulerequestDto.getContent(),
   //             schedulerequestDto.getCreatedAt(),
   //             schedulerequestDto.getUpdatedAt()
   //     );

   //     Schedule saveSchedule = scheduleRepository.save(schedule);

   //     return new ScheduleResponseDto(
   //             saveSchedule.getId(),
   //             saveSchedule.getUserId(),
   //             saveSchedule.getTitle(),
   //             saveSchedule.getContent(),
   //             saveSchedule.getCreatedAt(),
   //             saveSchedule.getUpdatedAt()
   //    );

    //}
}
