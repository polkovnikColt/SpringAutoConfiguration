package com.polkovnik;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "my.property", havingValue = "myclass")
public class MyClass implements InitializingBean {

  @Override
  public void afterPropertiesSet() {
    System.out.println("Configuration class created");
  }
}
