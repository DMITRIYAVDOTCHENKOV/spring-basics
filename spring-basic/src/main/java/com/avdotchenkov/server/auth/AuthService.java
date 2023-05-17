package com.avdotchenkov.server.auth;


import com.avdotchenkov.server.User;

public interface AuthService {

    boolean authUser(User user);
}
