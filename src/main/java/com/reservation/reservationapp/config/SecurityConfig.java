package com.reservation.reservationapp.config;


import com.reservation.reservationapp.entity.Role;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserDetailsService userDetailsService;

    public SecurityConfig(@Qualifier("playerDetailService") final UserDetailsService userDetailsService){
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected UserDetailsService userDetailsService() {
        return userDetailsService;
    }

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
                .hasAuthority(String.valueOf(Role.ADMIN))
                .antMatchers("/h2").permitAll();

        http.formLogin().loginPage("/login")
                .defaultSuccessUrl("/home", true)
                .failureUrl("/");

        http.logout().logoutSuccessUrl("/");

        http.csrf().ignoringAntMatchers("/h2-console/**")
                // umożliwia wczytywanie stron w ramkach
                // z tego samego źródła; wymagane dla H2
                .and()
                .headers()
                .frameOptions()
                .sameOrigin();


    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }
}
