package com.hfy.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author HAN XIAOYANG
 * @since 2020-12-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Book对象", description="")
public class Book implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "书籍ID")
    @TableId(value = "book_id", type = IdType.AUTO)
    private Integer bookId;

    @ApiModelProperty(value = "作者")
    private Integer writerId;

    @ApiModelProperty(value = "书名")
    private String bookName;

    @ApiModelProperty(value = "封面")
    private String bookPic;

    @ApiModelProperty(value = "标签")
    private String bookTag;

    @ApiModelProperty(value = "简介")
    private String bookIntroduction;

    @ApiModelProperty(value = "内容")
    private String bookContent;

    @ApiModelProperty(value = "票数")
    private Integer bookVote;

    @ApiModelProperty(value = "审核状态:0：未通过；1：通过")
    private Integer auditStatus;

    @ApiModelProperty(value = "0为非VIIP书籍，1为VIP书籍")
    private Integer bookVip;

    @ApiModelProperty(value = "0为未被删除；1为被删除")
    @TableLogic
    private Integer deleted;

    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;


}
