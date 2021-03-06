package com.HandsOn.SpringDemo.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // Need a controller method to show initial form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // Need a controller method to process HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }
}
