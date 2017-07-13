package com.xh.frame.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 远程配置文件服务
 * @author xh
 *
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class EurekaConfigApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(EurekaConfigApplication.class, args);
    }
	
	
}
