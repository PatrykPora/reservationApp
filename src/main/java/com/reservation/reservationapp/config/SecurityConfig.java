package com.reservation.reservationapp.config;


import com.reservation.reservationapp.entity.Role;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/contact", "/contact/**",
                        "/player", "/player/**",
                        "/home",
                        "/regulations",
                        "/reservation", "/reservation/**",
                        "/sportfacilitytermsofuse").hasRole(String.valueOf(Role.USER))
                .antMatchers("/home").permitAll()
                .antMatchers("/administration", "/administration/**")
                .hasRole(String.valueOf(Role.ADMIN))
                .antMatchers("/h2").permitAll();

        http.formLogin().loginPage("/login").defaultSuccessUrl("/home", true);

        http.logout().logoutSuccessUrl("/");

    }
}
