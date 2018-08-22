package com.hiynn.filecenter;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//开启断路器容错保护机制
@EnableHystrix
@SpringCloudApplication
public class FileCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(FileCenterApplication.class, args);
    }

    /**
     *
     * @author kehaiyong
     * @param
     * @return 注入RestTemplate，并开启ribbon负载均衡
     * @modified By
     * @throws
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}