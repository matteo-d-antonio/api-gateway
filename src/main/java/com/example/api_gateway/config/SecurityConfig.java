package com.example.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtBearerTokenAuthenticationConverter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/api/corsi/**").authenticated()  // Richiede autenticazione per i corsi
                .antMatchers("/api/docenti/**").authenticated()  // Richiede autenticazione per i docenti
                .antMatchers("/api/discenti/**").authenticated()
                .anyRequest().permitAll()  // Consenti tutte le altre richieste senza autenticazione
                .and()
                .oauth2ResourceServer()
                .jwt();
    }
}