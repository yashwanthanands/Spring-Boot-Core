package com.yash.dev.springcoredemo.utils;

import org.springframework.stereotype.Component;

/**
 * @author yashwanthanands
 */

@Component
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K";
    }
}
