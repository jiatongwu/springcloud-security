package com.nb.security.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 审计日志
 * </p>
 *
 * @author 李浩洋
 * @since 2019-10-27
 */
@Data
public class AuditLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * http方法
     */
    private String method;

    /**
     * 请求路径
     */
    private String path;

    /**
     * http状态码
     */
    private Integer status;

    /**
     * 请求用户名
     */
    private String username;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;


}
