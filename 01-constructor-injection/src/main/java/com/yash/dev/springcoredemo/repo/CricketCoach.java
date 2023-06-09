package com.yash.dev.springcoredemo.repo;

import org.springframework.stereotype.Component;

/**
 * @author yashwanthanands
 */
@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
