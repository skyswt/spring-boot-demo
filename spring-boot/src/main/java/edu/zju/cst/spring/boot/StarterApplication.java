package edu.zju.cst.spring.boot;

import edu.zju.cst.starter.hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@SpringBootApplication
public class StarterApplication {
    @Resource
    private HelloService helloService;

    @GetMapping("/")
    public String index() {
        return helloService.sayHello();
    }

    public static void main(String[] args) {
        SpringApplication.run(StarterApplication.class);
    }
}
