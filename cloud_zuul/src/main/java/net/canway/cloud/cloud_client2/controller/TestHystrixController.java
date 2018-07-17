package net.canway.cloud.cloud_client2.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestHystrixController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("getU")
    @HystrixCommand(fallbackMethod = "backGetUser")
    public String getUser() {
        String user = restTemplate.getForObject("http://client1/getUser", String.class);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return user;
    }

    public String backGetUser() {
        return "你需要的资源已经被熔断了";
    }
}
