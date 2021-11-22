package mykh.vitalii.spring.controller;

import javax.validation.Valid;
import mykh.vitalii.spring.dto.request.UserRequestDto;
import mykh.vitalii.spring.dto.response.UserResponseDto;
import mykh.vitalii.spring.model.User;
import mykh.vitalii.spring.service.AuthenticationService;
import mykh.vitalii.spring.service.mapper.UserMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    private final AuthenticationService authService;
    private final UserMapper userMapper;

    public AuthenticationController(AuthenticationService authService, UserMapper userMapper) {
        this.authService = authService;
        this.userMapper = userMapper;
    }

    @PostMapping("/register")
    public UserResponseDto register(@RequestBody @Valid UserRequestDto requestDto) {
        User user = authService.register(requestDto.getEmail(), requestDto.getPassword());
        return userMapper.mapToDto(user);
    }
}
