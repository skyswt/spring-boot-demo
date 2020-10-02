package edu.zju.cst.spring.demo.aop;

import org.springframework.stereotype.Service;

@Service
public class MethodService {
    public void add(){
        System.out.println("method invoked");
    }
}
