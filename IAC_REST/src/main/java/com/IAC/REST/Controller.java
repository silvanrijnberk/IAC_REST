package com.IAC.REST;

import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping("/current-date")
    public String currentDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    @PostMapping("/welcome")
    public String welcome(@RequestBody String name) {
        return "Welkom "+name+"!";
    }

}
