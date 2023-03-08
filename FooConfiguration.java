package com.Student.org;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {

    private final FooService repository;

    public FooConfiguration(FooService repository) {
        this.repository = repository;
    }

    @Bean
    public FooService fooService() {
        return new FooService(this.repository);
    }
}
