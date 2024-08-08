package com.example.multimodule.configuration;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public Integer nbInteger() {
        return 2024;
    }
}
