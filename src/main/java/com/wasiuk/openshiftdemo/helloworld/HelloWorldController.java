package com.wasiuk.openshiftdemo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
    	return "Hello World! v2";
    }
    
    @GetMapping("/envs")
    public String getEnvs() {
    	StringBuilder sb = new StringBuilder();
    	
    	for(String key : System.getenv().keySet()) {
    		sb.append(key + "=" + System.getenv().get(key) + "<br>");
    	}
    	
        return sb.toString();
    }
}
