package com.hfy.controller;


import com.hfy.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author HAN XIAOYANG
 * @since 2020-12-29
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @RequestMapping("/")
    public String hello(){
        return "HELLO!";
    }
    @RequestMapping("/showAll")
    public String showAll(){
        return bookMapper.selectList(null).toString();
    }

}

