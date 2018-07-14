package net.canway.cloud.cloud_boot;

import net.canway.cloud.cloud_boot.Bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


@SpringBootApplication
@EnableEurekaServer
@Controller
@Configuration
public class CloudBootApplication {

    @ResponseBody
    @RequestMapping(produces = "text/plain;charset=UTF-8", value = "getUser")
    public User getUser() {
        return new User(1, "张三", 23, "红褐色", new Date());
    }


    public static void main(String[] args) {
        SpringApplication.run(CloudBootApplication.class, args);
    }
}
