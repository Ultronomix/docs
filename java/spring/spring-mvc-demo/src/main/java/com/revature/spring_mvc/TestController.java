package com.revature.spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    /*
        Handles GET requests to /mvc-demo/test
        Resolves the returned string into an HTML view
     */
    @GetMapping("")
    public String test1() {
        return "index.html";
    }

    /*
        Handles GET requests to /mvc-demo/test/example
        Returns a raw string in the response body (does not try to resolve a view)
     */
    @GetMapping("/example")
    public @ResponseBody String test2() {
        return "this is the body of the response";
    }

}
