package com.web.service.ecdl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/* @formatter:off
 * WAR packaging:
 * - Changes:
 * pom.xml - Use: <packaging>war</packaging>
 * pom.xml - Not Use: <artifactId>spring-boot-starter-actuator</artifactId>
 * Home.java - Use: code bellow
 * ApplicationInitializer.java - Use: class
 * - Access:
 * localhost:8080/web-service-ecdl
 * - Swagger:
 * localhost:8080/web-service-ecdl/swagger-ui.html
 */
@Configuration
@EnableWebMvc
@ComponentScan
public class Home {
}

/* 
 * JAR packaging:
 * - Changes:
 * pom.xml - Use: <packaging>jar</packaging>
 * pom.xml - Use: <artifactId>spring-boot-starter-actuator</artifactId> 
 * Home.java - Use: bellow class
 * ApplicationInitializer.java - Not Use: class
 * - Access: 
 * localhost:8080
 * - Swagger:
 * localhost:8080/swagger-ui.html
 */
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
//@SpringBootApplication
//public class Home {
//  public static void main(String[] args) {
//    new SpringApplicationBuilder(Home.class).web(WebApplicationType.SERVLET).run(args);
//  }
//}
