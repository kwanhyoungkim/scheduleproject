package controller;


import com.example.scheduleproject.dto.UserResponseDto;
import com.example.scheduleproject.dto.UserSaveRequestDto;
import com.example.scheduleproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Validated
public class UserController {

    private final UserService userService;

    @PostMapping("/api/users")
    public ResponseEntity<UserResponseDto> save(@RequestBody UserSaveRequestDto requestDto) {
        return ResponseEntity.ok(userService.save(requestDto));
    }




}
