package net.canway.cloud.cloud_client2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.userServicePath}")
    private String userServicePath;

    public String getUser() {
        System.out.println("client1 2号被调用");
        String user = restTemplate.getForObject(userServicePath, String.class);
        return user;
    }

}
