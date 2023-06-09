package com.yash.dev.springcoredemo.utils;

import org.springframework.stereotype.Component;

/**
 * @author yashwanthanands
 */

@Component
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In constructor : "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
