package edu.zju.cst.spring.demo.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("edu.zju.cst.spring.demo.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
