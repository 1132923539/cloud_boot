package net.canway.cloud.cloud_client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
@EnableZuulProxy
public class Cloud_zuul {

    public static void main(String[] args) {
        SpringApplication.run(Cloud_zuul.class, args);
    }
}
