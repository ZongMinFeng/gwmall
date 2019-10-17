package com.gwmall.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author FengZongMin
 * @version 1.0
 * @ClassName EurekaApplication
 * @Description TODO
 * @CreateDate 2019-10-11 22:50
 * @UpdateDate 2019-10-11 22:50
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class);
    }
}
