package mykh.vitalii.spring.dao;

import java.util.Optional;
import mykh.vitalii.spring.model.User;

public interface UserDao {
    User add(User user);

    Optional<User> get(Long id);

    Optional<User> findByEmail(String email);
}
