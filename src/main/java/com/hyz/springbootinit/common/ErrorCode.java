package com.hyz.springbootinit.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 异常码
 *
 * @author hegd
 * @date 2023/6/13 22:55
 */
@Getter
@AllArgsConstructor
public enum ErrorCode {
    SUCCESS(0, "ok"),
    PARAMS_ERROR(40000, "请求参数错误"),

    NOT_LOGIN_ERROR(40100, "未登录"),
    NO_AUTH_ERROR(40101, "无权限"),

    NOT_FOUND_ERROR(40400, "请求数据不存在"),

    FORBIDDEN_ERROR(40300, "禁止访问"),

    SYSTEM_ERROR(50000, "系统内部异常"),
    OPERATION_ERROR(50001, "操作失败"),

    USER_OPERATION_ERROR(60000, "用户模块操作失败"),
    ADMIN_USER_OPERATION_ERROR(60001, "管理员用户操作失败"),
    ;

    /**
     * 异常码
     */
    private final int code;
    /**
     * 错误信息
     */
    private final String message;
}
