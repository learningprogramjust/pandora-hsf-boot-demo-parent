package com.aliware.edas.hsfboot;

import com.taobao.pandora.boot.PandoraBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//设置HSF的配置文件及限流降级配置
@ImportResource(locations = {"classpath:hsf-beans.xml","classpath*:sentinel-tracer.xml"})
public class HSFBootDemoConsumerApplication {
    public static void main(String[] args) {
        // 启动Pandora Boot 用于加载Pandora容器
        PandoraBootstrap.run(args);
         SpringApplication.run(HSFBootDemoConsumerApplication.class, args);
        // 标记服务启动完成,并设置线程wait。 通常在main函数最后一行调用。
        PandoraBootstrap.markStartupAndWait();

    }
}
