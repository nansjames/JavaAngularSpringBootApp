package com.econocom.threedivisibles;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class ThreedivisiblesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThreedivisiblesApplication.class, args);
	}

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
     /*   config.setAllowedOrigins(Arrays.asList("*"));
        config.setAllowedHeaders(Arrays.asList("*"));
        config.setExposedHeaders(Arrays.asList("*"));*/


        System.out.println("CorsFilter1");
        config.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type", "Accept",
                "Authorization","Origin, Accept", "X-Requested-With",
                 "Access-Control-Request-Method", "Access-Control-Request-Headers"));
        System.out.println("CorsFilter2");
        config.setExposedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type", "Accept",
                "Authorization","Access-Control-Allow-Credentials"));


        config.setAllowedMethods(Arrays.asList("GET","POST","PUT"));
        source.registerCorsConfiguration("/**", config);
       // FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
        //bean.setOrder(0);
        System.out.println("CorsFilter");
        return new CorsFilter(source);
    }

}
