package com.example.demo.logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/logs")
public class LoggerController {

    private final LoggerService loggerService;

    @Autowired
    public  LoggerController(LoggerService loggerService){
        this.loggerService=loggerService;
    }


    @GetMapping
    public List<Logger> get(){

        return  this.loggerService.get();
    }

    @PostMapping("/store")
    @ResponseBody
    public void store(@RequestBody String log){
       this.loggerService.store(log);
    }
}
