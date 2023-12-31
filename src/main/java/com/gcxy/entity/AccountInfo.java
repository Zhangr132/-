package com.gcxy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author zhangr132
 * @since 2023-12-12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("account_info")
@ApiModel(value = "AccountInfo对象", description = "用户表")
public class AccountInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户账号")
    @TableId(value = "account",type = IdType.ASSIGN_ID)
    private String account;

    @ApiModelProperty("用户姓名")
    private String accName;

    @ApiModelProperty("用户密码")
    private String password;

    @ApiModelProperty("手机号")
    private String accPhone;

    @ApiModelProperty("用户状态（0:启用；1:停用）")
    private Boolean status;

    @ApiModelProperty("注册时间")
    private Date createTime;

    @ApiModelProperty("最后登录时间")
    private Date updateTime;


}