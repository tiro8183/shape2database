package com.agriview.shp2database.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 数据源存储表
 * </p>
 *
 * @author WHY
 * @since 2022/06/15
 */
@Data
@TableName(value = "database", autoResultMap = true)
public class Database implements Serializable {
    private static final long serialVersionUID = 6947403344262247581L;
    /**
     * 数据源id
     */
    @TableId("id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 数据源名称
     */
    @TableField("name")
    private String name;

    /**
     * url
     */
    @TableField("url")
    @NotBlank(message = "url不能为空")
    private String url;

    /**
     * 用户名
     */
    @TableField("username")
    @NotBlank(message = "用户名不能为空")
    private String username;

    /**
     * 密码
     */
    @TableField("password")
    @NotBlank(message = "密码不能为空")
    private String password;

    /**
     * 数据库类型
     */
    @TableField("database_type")
    private String databaseType;

    /**
     * 数据库驱动
     */
    @TableField("driver_class_name")
    @NotBlank(message = "数据库驱动不能为空")
    private String driverClassName;

    /**
     * 数据库名
     */
    @TableField("database_name")
    @NotBlank(message = "数据库名不能为空")
    private String databaseName;

    /**
     * 数据库host
     */
    @TableField("database_host")
    @NotBlank(message = "数据库host不能为空")
    private String databaseHost;

    /**
     * 数据库端口
     */
    @TableField("database_port")
    @NotBlank(message = "数据库端口不能为空")
    private String databasePort;

}
