package com.example.learnspringsecurity;

import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MyConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

       http.authorizeHttpRequests().requestMatchers("/Admin/**").hasRole("ADMIN")
                .requestMatchers("/home/**").authenticated()
                .requestMatchers("/**").permitAll().and().formLogin().and().csrf().disable();

        return http.build();
    }
}

