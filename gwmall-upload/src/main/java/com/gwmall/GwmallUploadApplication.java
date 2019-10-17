package com.gwmall;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author FengZongMin
 * @version 1.0
 * @ClassName GwmallUploadApplication
 * @Description TODO
 * @CreateDate 2019-10-17 18:48
 * @UpdateDate 2019-10-17 18:48
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class GwmallUploadApplication {
    public static void main(String[] args) {
        SpringApplication.run(GwmallUploadApplication.class);
    }
}
