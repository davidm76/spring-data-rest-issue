package com.example.demo;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:davidm@yambay.com">David MacDonald</a>
 */
@Component
class RepositoryCustomization implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

        config.withEntityLookup().
                forRepository(UserRepository.class, User::getUserName, UserRepository::findByUserName);
    }
}
