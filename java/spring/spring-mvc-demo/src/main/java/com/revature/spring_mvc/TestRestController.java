package com.revature.spring_mvc;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController // implies @Controller at the class-level and @ResponseBody for all method return types
@RequestMapping("/rest-test")
public class TestRestController {

    /*
        Handles GET requests to /mvc-demo/rest-test
     */
    @GetMapping
    public String sanity() {
        return "/test works!";
    }

    /*
        Handles GET requests to /mvc-demo/rest-test/example-1
     */
    @GetMapping("/example-1")
    public String example1() {
        return "/test/example-1 works!";
    }

    /*
        Handles GET requests to /mvc-demo/rest-test/example-2?something=123
        Requires a request param with the key "something" to be present on the request
     */
    @GetMapping("/example-2")
    public String example2(@RequestParam("something") String key) {
        return "Value provided in exampleKey: " +  key;
    }

    /*
        Handles GET requests to /mvc-demo/rest-test/example-3
        Requires that a path variable be present at the end of the URI
     */
    @GetMapping("/example-3/{pathVar}")
    public String example3(@PathVariable String pathVar) {
        return "Value provided in pathVar: " + pathVar;
    }

    /*
        Handles GET requests to /mvc-demo/rest-test/example-4
        Requires a request header with the name "myHeader"
     */
    @GetMapping("/example-4")
    public String example4(@RequestHeader String myHeader) {
        return "Value provided in myHeader: " + myHeader;
    }

    /*
        Handles POST requests to /mvc-demo/rest-test/example-5
        Will attempt to map the NewTaskRequest JSON in the request body
     */
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/example-5", consumes = "application/json", produces = "application/json")
    public NewTaskRequest example5(@RequestBody NewTaskRequest task) {
        task.setId(UUID.randomUUID().toString());
        return task;
    }

    /*
        Handles GET requests to /mvc-demo/rest-test/example-6
        Throws an exception that is dealt with by the exception handler below
     */
    @GetMapping("/example-6")
    public void example6() {
        throw new RuntimeException("Exception handler demo");
    }

    @ExceptionHandler
    public ErrorResponse handleRuntimeException(RuntimeException e) {
        return new ErrorResponse(400, e.getMessage());
    }

}
