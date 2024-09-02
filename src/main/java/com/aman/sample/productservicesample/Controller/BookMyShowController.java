package com.aman.sample.productservicesample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookMyShowController {

    @RequestMapping("hello")
    public String sayhello() {
        return "Welcome to the new world";
    }

    @GetMapping("/screen/{screenId}/movie/{name}")
    public String bookmyshow(@PathVariable("screenId") int screen, @PathVariable("name") String name) {

        return "Welcome to the theatre " + "\nYour screen no. is " + screen + "\nYour moive is " + name +
                " \nPopcorn is free";
        /*
        if we want to return multiline string , we should use \n
         */
    }

}
