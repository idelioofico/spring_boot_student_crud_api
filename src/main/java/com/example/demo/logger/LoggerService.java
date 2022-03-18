package com.example.demo.logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoggerService {


    private final LoggerRepository loggerRepository;

    @Autowired
    public  LoggerService(LoggerRepository loggerRepository){
        this.loggerRepository=loggerRepository;
    }


    public List<Logger> get(){
        return  this.loggerRepository.findAll();
    }

    public void store(String log){
        System.out.println(log);
//        this.loggerRepository.save(log);
    }

}
