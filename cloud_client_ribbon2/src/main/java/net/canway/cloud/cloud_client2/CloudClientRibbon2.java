package net.canway.cloud.cloud_client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudClientRibbon2 {

    public static void main(String[] args) {
        SpringApplication.run(CloudClientRibbon2.class, args);
    }
}
