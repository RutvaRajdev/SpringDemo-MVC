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

    // New controller method to read form data and add data to model
    @RequestMapping("/processFormVersionTwo")
    public String letsShout(HttpServletRequest request, Model model){
        String theName = request.getParameter("studentName");

        theName = theName.toUpperCase();

        String result = "Hey!" + theName;

        model.addAttribute("message", result);
        return "helloworld";
    }
}
