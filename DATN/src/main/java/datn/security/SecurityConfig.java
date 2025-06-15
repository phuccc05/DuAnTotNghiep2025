package datn.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Tắt CSRF để gọi API từ JS
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/", "/gio-hang.html", "/css/**", "/js/**", "/images/**").permitAll() // Cho phép truy cập không cần login
                        .requestMatchers("/api/**").permitAll() // Mở quyền REST API
                        .anyRequest().authenticated() // Các URL khác cần đăng nhập
                );

        return http.build();
    }
}
