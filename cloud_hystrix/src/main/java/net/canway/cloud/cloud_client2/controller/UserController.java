package net.canway.cloud.cloud_client2.controller;

import net.canway.cloud.cloud_client2.Feign.UseFeign;
import net.canway.cloud.cloud_client2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //这个负载均衡已经类已经由spring boot自动配置，所以可以自动注入
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private UseFeign useFeign;


    @GetMapping(value = "/getUser")
    public String getU() {
        return userService.getUser();
    }

    @GetMapping(value = "/getU2")
    public String getUs() {
        return useFeign.findUserById(12) + useFeign.findUser();
    }

    @GetMapping("/test")
    public String test() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("client1");

        String s1 = "<h1>111" + ":" + serviceInstance.getServiceId() + ":" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "</h1>";


//        ServiceInstance serviceInstance2 = this.loadBalancerClient.choose("client1");
//        String s2 = "<h1>222" + ":" + serviceInstance2.getServiceId() + ":" + serviceInstance2.getHost() + ":" + serviceInstance2.getPort() + "</h1>";

        return s1;
    }
}
