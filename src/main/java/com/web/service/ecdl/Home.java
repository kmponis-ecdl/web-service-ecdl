package com.web.service.ecdl;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * Access point for application, for .war packaging. Add <packaging>war</packaging> bellow
 * <name>web-service-files</name> in pom.xml
 */
// @Configuration
// @EnableWebMvc
// @ComponentScan
// public class Home {
// }

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class Home {

  public static void main(String[] args) {
    new SpringApplicationBuilder(Home.class).web(WebApplicationType.SERVLET).run(args);
  }
}
