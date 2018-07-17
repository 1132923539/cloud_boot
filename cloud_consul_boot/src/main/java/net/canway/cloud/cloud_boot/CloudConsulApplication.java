package net.canway.cloud.cloud_boot;

import net.canway.cloud.cloud_boot.Bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


@SpringBootApplication
@EnableDiscoveryClient
@Controller
@Configuration
public class CloudConsulApplication {

    @ResponseBody
    @RequestMapping(produces = "text/plain;charset=UTF-8", value = "getUser")
    public User getUser() {
        return new User(1, "张三", 23, "红褐色", new Date());
    }


    public static void main(String[] args) {
        SpringApplication.run(CloudConsulApplication.class, args);
    }
}
