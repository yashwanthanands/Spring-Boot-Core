package com.yash.dev.springcoredemo.utils;

import org.springframework.stereotype.Component;

/**
 * @author yashwanthanands
 */

@Component
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}
