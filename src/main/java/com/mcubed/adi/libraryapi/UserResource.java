package com.mcubed.adi.libraryapi;


import com.mcubed.adi.libraryapi.security.AccessLevel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    @RequestMapping(method = RequestMethod.GET, path = "/user")
    @AccessLevel(value = Roles.SYSTEM_READ_ONLY)
    public String getHello() {
        return "Hello";
    }
}
