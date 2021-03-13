package com.polkovnik;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(MyClass.class)
public class IfPresent implements InitializingBean {

  @Override
  public void afterPropertiesSet() {
    System.out.println("ConditionalOnPresent my class");
  }
}
