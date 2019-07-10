package com.hoodwink.userqueue;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserqueueApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserqueueApplication.class, args);
    }

}
