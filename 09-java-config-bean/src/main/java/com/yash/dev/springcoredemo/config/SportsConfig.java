package com.yash.dev.springcoredemo.config;

import com.yash.dev.springcoredemo.utils.Coach;
import com.yash.dev.springcoredemo.utils.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yashwanthanands
 */

@Configuration
public class SportsConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }

}
