package com.hiynn.searchcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringCloudApplication
//开启断路器容错保护机制
@EnableHystrix
public class SearchCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchCenterApplication.class, args);
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