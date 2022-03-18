package com.example.demo.logger;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
//@Table(name = "logger")
public class Logger {

    @Id
    @SequenceGenerator(
            name = "logger_sequence",
            sequenceName = "logger_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "logger_sequence"
    )
    private  Long id;
    private LocalDateTime datetime;
    private String from;
    private String to;
    private  String body;

    public  Logger(){

    };

    public Logger(LocalDateTime datetime, String from, String to, String body) {
        this.datetime = datetime;
        this.from = from;
        this.to = to;
        this.body = body;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
