package com.stars.musicApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {

        UserDetails jack = User.builder()
                .username("jack")
                .password("{noop}123")
                .roles("Kullanici")
                .build();

        UserDetails karl = User.builder()
                .username("karl")
                .password("{noop}1234")
                .roles("Misafir")
                .build();

        UserDetails harry = User.builder()
                .username("harry")
                .password("{noop}12345")
                .roles("Kullanici", "Misafir", "Uye")
                .build();

        return new InMemoryUserDetailsManager(jack, karl, harry);
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                        configurer
                                .requestMatchers("/kullanici").hasRole("Kullanici")
                                .requestMatchers("/misafir/**").hasRole("Misafir")
                                .requestMatchers("/uye/**").hasRole("Uye")
                                .anyRequest().authenticated()
                )
                .formLogin(form ->
                        form
                                .loginPage("/anaSayfa")
                                .loginProcessingUrl("/authenticateTheUser")
                                .permitAll()
                )
                .logout(logout -> logout.permitAll())
                .exceptionHandling(configurer ->
                        configurer.accessDeniedPage("/access-denied")
                );

        return http.build();
    }
}
