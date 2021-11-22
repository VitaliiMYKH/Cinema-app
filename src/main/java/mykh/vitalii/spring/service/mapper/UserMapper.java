package mykh.vitalii.spring.service.mapper;

import java.util.stream.Collectors;
import mykh.vitalii.spring.dto.response.UserResponseDto;
import mykh.vitalii.spring.model.Role;
import mykh.vitalii.spring.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements ResponseDtoMapper<UserResponseDto, User> {
    @Override
    public UserResponseDto mapToDto(User user) {
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setId(user.getId());
        responseDto.setEmail(user.getEmail());
        responseDto.setRoles(user.getRoles()
                .stream()
                .map(Role::getName)
                .collect(Collectors.toList()));
        return responseDto;
    }
}
