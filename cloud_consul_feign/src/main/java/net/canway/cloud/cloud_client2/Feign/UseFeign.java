package net.canway.cloud.cloud_client2.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient("boot1")
public interface UseFeign {


    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    String findUser();

}
