package com.wbj.book.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 日志表
 * </p>
 *
 * @author bingjie.wang
 * @since 2021-12-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SysLog对象", description="日志表")
public class SysLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "操作地址的IP")
    private String ip;

    @ApiModelProperty(value = "操作时间")
    private LocalDateTime createBy;

    @ApiModelProperty(value = "操作内容")
    private String remark;

    @ApiModelProperty(value = "操作的访问地址")
    private String operateUrl;

    @ApiModelProperty(value = "操作的浏览器")
    private String operateBy;


}
