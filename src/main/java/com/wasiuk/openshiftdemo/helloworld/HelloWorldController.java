package com.wasiuk.openshiftdemo.helloworld;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
    	return "Hello World! v5";
    }
    
    @GetMapping("/envs")
    public String getEnvs() {
    	StringBuilder sb = new StringBuilder();
    	
    	for(String key : System.getenv().keySet()) {
    		sb.append(key + "=" + System.getenv().get(key) + "<br>");
    	}
    	
        return sb.toString();
    }
    
    @GetMapping("/scalling")
    public String scalling() {
    	String ret = "nie udalo sie";
		try {
	    	InetAddress ia;
			ia = InetAddress.getLocalHost();
			ret = ia.getHostName() + ", " + ia.getHostAddress() + ", " + ia.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return ret;
    }
}
