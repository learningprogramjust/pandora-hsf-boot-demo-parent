package com.aliware.edas.hsfboot.config;

import com.alibaba.boot.hsf.annotation.HSFConsumer;
import com.aliware.edas.hsfboot.api.ApplicationApi;
import com.aliware.edas.hsfboot.api.UsersApi;
import com.aliware.edas.hsfboot.api.VersionInfoApi;
import org.springframework.context.annotation.Configuration;

/**
 * @author Hofoo
 * @since 2017-12-07 16:05
 */
@Configuration
public class HsfConfig {

//    @HSFConsumer(serviceGroup = "HSF", clientTimeout = 3000, serviceVersion = "1.0.0")
//    private VersionInfoApi<?> versionInfoApi;
//
//
//    @HSFConsumer(serviceGroup = "HSF", clientTimeout = 3000, serviceVersion = "1.0.0")
//    private ApplicationApi applicationApi;

    @HSFConsumer(serviceGroup = "HSF", serviceVersion = "1.0.0")
    private UsersApi usersApi;
}
