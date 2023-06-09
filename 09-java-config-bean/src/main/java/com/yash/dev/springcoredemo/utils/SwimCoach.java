package com.yash.dev.springcoredemo.utils;

/**
 * @author yashwanthanands
 */
public class SwimCoach implements Coach  {

    public SwimCoach() {
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000m as a warm up";
    }
}
