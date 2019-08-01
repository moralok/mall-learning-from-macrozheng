package com.moralok.mall.tiny.service;

import com.moralok.mall.tiny.common.api.CommonResult;

/**
 * 会员管理Service
 *
 * @author moralok
 * @date 2019/7/31
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
