package com.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyIRule {

  @Bean
  public IRule myRule() {
    // return new RandomRule();
    // 调用自定义的方法
    return new MyRandomRule();
  }
}
