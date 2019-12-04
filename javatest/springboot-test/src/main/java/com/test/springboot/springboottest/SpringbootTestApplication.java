package com.test.springboot.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@SpringBootApplication
public class SpringbootTestApplication  implements ServletContextInitializer {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootTestApplication.class, args);
    }

    @Override
    public void onStartup(ServletContext context) throws ServletException {
        context.getSessionCookieConfig().setName("client-session");
    }
}
