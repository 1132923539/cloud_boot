package net.canway.cloud.cloud_client2.controller;

import net.canway.cloud.cloud_client2.Bean.User;
import net.canway.cloud.cloud_client2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/getUser", produces = "application/json;charset=utf-8")
    public User getU() {
        System.out.println("client1被调用");
        return new User(19, "里斯", 25, "紫色", new Date(2342422));
    }

    @GetMapping(value = "/getUser/{id}", produces = "application/json;charset=utf-8")
    public User getUser(@PathVariable("id") Integer id) {
        System.out.println("client1被调用，传入的id是:" + id);
        return new User(25, "刘亦菲", 25, "淡紫色", new Date(2342422));
    }
}
