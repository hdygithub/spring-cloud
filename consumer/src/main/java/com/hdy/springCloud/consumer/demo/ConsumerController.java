package com.hdy.springCloud.consumer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServlet;

/**
 * Created by huadongyang on 2017/5/27.
 */
@RestController
@RequestMapping(value = "/calculate", method = RequestMethod.POST)
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add")
    public String add(HttpServlet httpServlet){
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/calculate/add?a=10&b=20",String.class).getBody();
    }
}
