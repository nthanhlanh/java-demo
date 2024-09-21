package com.example.demo.config;

import lombok.RequiredArgsConstructor;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class OpenApiConfig {


    @Bean
    GroupedOpenApi bookApis() { // group all APIs with `auth` in the path
        return GroupedOpenApi.builder().group("books").pathsToMatch("/api/v1/books/**").build();
    }

   
}