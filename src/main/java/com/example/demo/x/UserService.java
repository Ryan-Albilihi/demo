package com.example.demo.x;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    public List<User> getUser(){
        return Arrays.asList(
                new User(
                        1,
                        "ryan",
                        "abc@m.cn",
                        23
                )
        );
    }
}
//update