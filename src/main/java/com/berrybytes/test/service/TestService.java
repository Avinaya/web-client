package com.berrybytes.test.service;

import com.berrybytes.test.model.User;
import reactor.core.publisher.Mono;

import java.util.List;

public interface TestService {

    List<User> getUserData();
}
