package az.edu.ada.wm2.authorcrudsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    @Bean
    public String greetText() {
        return "Hello all, Welcome!";
    }

    @Bean
    public String byeText() {
        return "Farewell, my friend!";
    }


}
