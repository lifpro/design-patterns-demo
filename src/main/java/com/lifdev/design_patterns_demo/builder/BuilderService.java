package com.lifdev.design_patterns_demo.builder;

import org.springframework.stereotype.Service;

//@Service
public class BuilderService{
    User user = new User.Builder()
            .firstName("Ali")
            .lastName("Traoré")
            .email("ali@mail.com")
            .role("ADMIN")
            .build();
}
