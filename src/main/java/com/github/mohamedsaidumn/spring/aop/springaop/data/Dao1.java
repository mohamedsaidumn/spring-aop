package com.github.mohamedsaidumn.spring.aop.springaop.data;

import com.github.mohamedsaidumn.spring.aop.springaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
    @TrackTime
    public String retrieveSomething(){
        return "Dao1";
    }

}