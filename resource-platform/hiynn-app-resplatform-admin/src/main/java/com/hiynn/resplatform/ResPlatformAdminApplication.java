package com.hiynn.resplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

//开启断路器容错保护机制
@EnableHystrix
@SpringBootApplication
@EnableTransactionManagement
@ServletComponentScan
@EnableDiscoveryClient
@MapperScan("com.hiynn.resplatform.admin.*.dao")
@RefreshScope
public class ResPlatformAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResPlatformAdminApplication.class, args);
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
