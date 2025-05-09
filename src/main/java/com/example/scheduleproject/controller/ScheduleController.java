package com.example.scheduleproject.controller;

import com.example.scheduleproject.entity.Schedule;
import com.example.scheduleproject.service.ScheduleService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ScheduleController {



    // 일정 생성
    @PostMapping("/api/schedules")
    public ResponseEntity<Schedule> saveSchedule(@RequestBody String title, String content){
        Schedule saveSchedule = ScheduleService.saveSchedule(title,content);
    }


    // 일정 조회
    @GetMapping("/api/schedules/{id}")
    public ResponseEntity<List<Schedule>> getAllSchedule(HttpStatusCode Ok){
        List<Schedule> schedule=ScheduleService.getAllSchedule();
        return new ResponseEntity<>(schedule, Ok);
    }



    // 일정 수정
    @PutMapping("/api/schedules/{id}")
    public ResponseEntity<String> updateSchedule(@PathVariable Long id){
        ScheduleService.updateSchedule(id);
        return  new ResponseEntity<>("일정이 수정되었습니다",HttpStatusCode.valueOf(200));
    }


    // 일정 삭제
    @DeleteMapping("/api/schedules/{id}")
    public ResponseEntity<String> deleteSchedule(@PathVariable Long id){
        ScheduleService.deletedSchedule(id);
        return new ResponseEntity<>("일정이 삭제되었습니다", HttpStatusCode.valueOf(201));
    }
}
