package com.moralok.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 *
 * @author moralok
 * @date 2019/7/31
 */
@Configuration
@MapperScan({"com.moralok.mall.tiny.mbg.mapper","com.moralok.mall.tiny.dao"})
public class MyBatisConfig {
}
