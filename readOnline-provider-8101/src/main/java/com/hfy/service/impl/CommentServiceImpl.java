package com.hfy.service.impl;

import com.hfy.entity.Comment;
import com.hfy.mapper.CommentMapper;
import com.hfy.service.CommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
