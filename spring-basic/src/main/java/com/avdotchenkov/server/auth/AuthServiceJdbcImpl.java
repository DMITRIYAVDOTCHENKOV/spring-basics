package com.avdotchenkov.server.auth;

import com.avdotchenkov.server.User;
import com.avdotchenkov.server.persistance.UserRepository;
import org.springframework.stereotype.Service;


import java.sql.SQLException;

@Service
public class AuthServiceJdbcImpl implements AuthService {

    private final UserRepository userRepository;

    public AuthServiceJdbcImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean authUser(User user) {
        try {
            User usr = userRepository.findByLogin(user.getLogin());
            return usr.getId() > 0 && usr.getPassword().equals(user.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
