package com.cloud.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by mutoulazy on 2018/7/26.
 */
@Configuration
public class ConfigBean {

  /**
   * RestTemplate提供了多种便捷访问远程Http服务的方法， 是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模板工具集。
   * LoadBalanced要求客户端通过Rest去访问微服务的时候自带负载均衡
   */
  @Bean
  @LoadBalanced
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }

  @Bean
  public IRule myIRule() {
    // 使用随机规则替换默认的轮询规则
    return new RandomRule();
  }
}
