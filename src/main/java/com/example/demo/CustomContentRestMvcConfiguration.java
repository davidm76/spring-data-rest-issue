package com.example.demo;

import java.net.URI;

import org.springframework.content.rest.config.ContentRestConfigurer;
import org.springframework.content.rest.config.RestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class CustomContentRestMvcConfiguration {

    @Bean
    public ContentRestConfigurer contentRestConfigurer() {

        return new ContentRestConfigurer() {

            @Override
            public void configure(RestConfiguration config) {
                config.setBaseUri(URI.create("/contentApi"));
            }
        };
    }
}