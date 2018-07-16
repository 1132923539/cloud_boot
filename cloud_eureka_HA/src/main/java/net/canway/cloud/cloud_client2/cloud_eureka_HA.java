package net.canway.cloud.cloud_client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableEurekaServer
public class cloud_eureka_HA {

    public static void main(String[] args) {
        SpringApplication.run(cloud_eureka_HA.class, args);
    }
}
