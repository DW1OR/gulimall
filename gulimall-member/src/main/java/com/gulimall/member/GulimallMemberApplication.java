package com.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 想要远程调用其他模块的服务
 * 1、先引入open-feign
 * 2、编写一个接口，告诉springCloud这个接口需要调用远程服务
 * 3、接口的每个方法都是调用对应远程服务的请求
 * 4、开启远程调用功能
 */
@EnableFeignClients(basePackages = "com.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
