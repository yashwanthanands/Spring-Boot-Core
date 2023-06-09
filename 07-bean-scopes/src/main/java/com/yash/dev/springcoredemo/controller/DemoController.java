package com.yash.dev.springcoredemo.controller;


import com.yash.dev.springcoredemo.utils.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yashwanthanands
 */

@RestController
public class DemoController {

    Coach myCoach;
    Coach anotherCoach;



    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach theCoach,
                          @Qualifier("baseballCoach") Coach theAnotherCoach) {
        System.out.println("In Demo Controller");
        myCoach= theCoach;
        anotherCoach=theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkOut(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans :myCoach == anotherCoach, "+ (myCoach == anotherCoach);
    }
}
