package com.moralok.mall.tiny.common.api;

/**
 * 封装API的错误码
 *
 * @author moralok
 * @date 2019/7/31
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
