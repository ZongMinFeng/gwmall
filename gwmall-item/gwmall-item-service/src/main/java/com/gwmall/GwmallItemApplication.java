package com.gwmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author FengZongMin
 * @version 1.0
 * @ClassName GwmallItemApplication
 * @Description TODO
 * @CreateDate 2019-10-11 23:36
 * @UpdateDate 2019-10-11 23:36
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.gwmall.item.mapper")
public class GwmallItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(GwmallItemApplication.class);
    }
}
