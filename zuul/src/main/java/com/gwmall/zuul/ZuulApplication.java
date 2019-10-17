package com.gwmall.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author FengZongMin
 * @version 1.0
 * @ClassName ZuulApplication
 * @Description TODO
 * @CreateDate 2019-10-11 22:57
 * @UpdateDate 2019-10-11 22:57
 **/
@EnableZuulProxy
@SpringCloudApplication
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class);
    }
}
