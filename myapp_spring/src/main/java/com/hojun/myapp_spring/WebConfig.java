package com.hojun.myapp_spring;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer  {

    /**
     * 개발 환경에서의 크로스 도메인 이슈를 해결하기 위한 코드로
     * 운영 환경에 배포할 경우에는 15~18행을 주석 처리합니다.
     *
     * ※크로스 도메인 이슈: 브라우저에서 다른 도메인으로 URL 요청을 하는 경우 나타나는 보안문제
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                //.allowCredentials(true)
                .allowedOrigins("*")
                //.allowedOrigins("http://localhost:3000/", "http://localhost:8000/")
                //.exposedHeaders("jwt-token")
                .allowedMethods("*")
                .allowedHeaders("*"); // .allowedMethods("GET", "POST","DELETE", "OPTIONS")

    }
}
