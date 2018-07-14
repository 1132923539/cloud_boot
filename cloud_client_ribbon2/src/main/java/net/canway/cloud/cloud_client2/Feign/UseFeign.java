package net.canway.cloud.cloud_client2.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient("client1")
public interface UseFeign {

    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    public String findUserById(@PathVariable("id") Integer id);

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String findUser();

}
