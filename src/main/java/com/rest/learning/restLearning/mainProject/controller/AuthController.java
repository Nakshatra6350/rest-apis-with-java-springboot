package com.rest.learning.restLearning.mainProject.controller;

import com.rest.learning.restLearning.mainProject.dto.LoginRequestDto;
import com.rest.learning.restLearning.mainProject.dto.LoginResponseDto;
import com.rest.learning.restLearning.mainProject.dto.SignUpRequestDto;
import com.rest.learning.restLearning.mainProject.dto.SignupResponseDto;
import com.rest.learning.restLearning.mainProject.security.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto loginRequestDto) {
        return ResponseEntity.ok(authService.login(loginRequestDto));
    }

    @PostMapping("/signup")
    public ResponseEntity<SignupResponseDto> signup(@RequestBody SignUpRequestDto signupRequestDto) {
        return ResponseEntity.ok(authService.signup(signupRequestDto));
    }
}
