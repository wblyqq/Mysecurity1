package com.springboot;

import com.springboot.common.VerifyServlet;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MysecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysecurityApplication.class, args);
    }
    /*
    注入验证码servlet
     */

    @Bean
    public ServletRegistrationBean indexServletRegistration(){
        ServletRegistrationBean registration = new ServletRegistrationBean(new VerifyServlet());
        registration.addUrlMappings("/getVerifyCode");
        return registration;
    }


}
