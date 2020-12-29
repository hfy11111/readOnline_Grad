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
@ApiModel(value="Writer对象", description="")
public class Writer implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "作者ID")
    @TableId(value = "writer_id", type = IdType.AUTO)
    private Integer writerId;

    @ApiModelProperty(value = "用户ID")
    private Integer userId;

    @ApiModelProperty(value = "作者名称")
    private String writerName;

    @ApiModelProperty(value = "作者简介")
    private String writerIntroduction;

    @ApiModelProperty(value = "银行卡号")
    private String bankcard;

    @ApiModelProperty(value = "作者获得票数")
    private Integer writerVote;

    @ApiModelProperty(value = "0为未被删除；1为被删除")
    @TableLogic
    private Integer deleted;

    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;


}
