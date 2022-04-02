package com.reservation.reservationapp.config;


import com.reservation.reservationapp.entity.Role;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder(){return new BCryptPasswordEncoder();}

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/home",
                        "/contact", "/contact/**",
                        "/player", "/player/**",
                        "/home",
                        "/regulations",
                        "/reservation", "/reservation/**",
                        "/sportfacilitytermsofuse").authenticated()
                .antMatchers("/administration", "/administration/**")
                .hasRole(String.valueOf(Role.ADMIN))
                .antMatchers("/h2").permitAll();

        http.formLogin().loginPage("/login").defaultSuccessUrl("/home", true);

        http.logout().logoutSuccessUrl("/");

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user1").password("{noop}admin").roles(String.valueOf(Role.ADMIN))
                .and()
                .withUser("user2").password("{noop}1234").roles(String.valueOf(Role.USER));

    }
}
