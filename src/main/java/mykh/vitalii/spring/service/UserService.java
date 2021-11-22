package mykh.vitalii.spring.service;

import java.util.Optional;
import mykh.vitalii.spring.model.User;

public interface UserService {
    User add(User user);

    User get(Long id);

    Optional<User> findByEmail(String email);
}
