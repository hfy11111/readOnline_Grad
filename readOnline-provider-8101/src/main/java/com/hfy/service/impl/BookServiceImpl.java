package com.hfy.service.impl;

import com.hfy.entity.Book;
import com.hfy.mapper.BookMapper;
import com.hfy.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HAN XIAOYANG
 * @since 2020-12-29
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
