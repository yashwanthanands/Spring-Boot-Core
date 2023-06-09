package com.yash.dev.springcoredemo.utils;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author yashwanthanands
 */

@Component
@Lazy
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In constructor : "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K";
    }
}
