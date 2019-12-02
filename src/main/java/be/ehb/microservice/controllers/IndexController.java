package be.ehb.microservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.util.MimeType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping(method = RequestMethod.GET, value = {"", "/index"})
    @ResponseBody
    public String sayHelloWorld(){
        return "Hello World";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/{name}", "/index/{name}"})
    @ResponseBody
    public String sayHelloToSomeone(@PathVariable(value = "name") String name){
        return "Hello " + name;
    }
}
