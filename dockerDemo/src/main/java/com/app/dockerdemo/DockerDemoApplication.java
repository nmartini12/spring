package com.app.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@SpringBootApplication
@RestController
public class DockerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoApplication.class, args);
    }

    @GetMapping("/test")
    public Map<String, Object> sayHello(){
        Map<String, Object> data = new HashMap<>();
        data.put("name","From Docker nouvel ajout");
        data.put("NEW","NEW TEXT PUSH 3");
        data.put("counter",10);
        return data;
    }
}
