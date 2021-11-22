package mykh.vitalii.spring.service;

import mykh.vitalii.spring.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
