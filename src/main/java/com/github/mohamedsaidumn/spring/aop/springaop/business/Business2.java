package com.github.mohamedsaidumn.spring.aop.springaop.business;

import com.github.mohamedsaidumn.spring.aop.springaop.aspect.TrackTime;
import com.github.mohamedsaidumn.spring.aop.springaop.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {
    @Autowired
    private Dao2 dao2;

    @TrackTime
    public String calculateSomething(){
        //Business Logic
        return dao2.retrieveSomething();
    }
}
