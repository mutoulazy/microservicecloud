package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by mutoulazy on 2018/7/26.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.cloud")
@ComponentScan("com.cloud")
public class DeptConsumer80_Feign_App {

  public static void main(String[] args) {
    SpringApplication.run(DeptConsumer80_Feign_App.class, args);
  }
}
