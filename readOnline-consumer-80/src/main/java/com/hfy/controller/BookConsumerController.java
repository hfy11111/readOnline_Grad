package com.hfy.controller;

import com.hfy.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BookConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @RequestMapping("/getById/{id}")
    public String get(@PathVariable("id") int id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/book/getById/"+id,String.class);
    }

}
