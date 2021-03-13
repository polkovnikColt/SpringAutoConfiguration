package com.polkovnik;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnMissingBean(name = "myclass")
public class IfMissing implements InitializingBean {

  @Override
  public void afterPropertiesSet() {
    System.out.println("ConditionalOnMissing my class");
  }
}
