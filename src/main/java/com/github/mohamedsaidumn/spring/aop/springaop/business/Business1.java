package com.github.mohamedsaidumn.spring.aop.springaop.business;

import com.github.mohamedsaidumn.spring.aop.springaop.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    //private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Dao1 dao1;

    public String calculateSomething(){
        //Business Logic
        String value = dao1.retrieveSomething();
        //logger.info("In Business - {}", value);
        return value;
    }
}
