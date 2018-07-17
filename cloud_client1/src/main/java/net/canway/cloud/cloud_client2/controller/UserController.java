package net.canway.cloud.cloud_client2.controller;

import net.canway.cloud.cloud_client2.Bean.User;
import net.canway.cloud.cloud_client2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


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

    @GetMapping("list-all")
    public List<User> listAll() {
        ArrayList<User> list = new ArrayList();
        User user = new User(23, "zhangsan", 12, "21", new Date());
        User user2 = new User(23, "zhangsan", 12, "21", new Date());
        User user3 = new User(23, "zhangsan", 12, "21", new Date());
        list.add(user);
        list.add(user2);
        list.add(user3);
        return list;

    }
}
