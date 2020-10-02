package edu.zju.cst.spring.demo.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        SingletonService s1 = context.getBean(SingletonService.class);
        SingletonService s2 = context.getBean(SingletonService.class);
        PrototypeService p1 = context.getBean(PrototypeService.class);
        PrototypeService p2 = context.getBean(PrototypeService.class);
        System.out.println(s1.equals(s2));
        System.out.println(p1.equals(p2));
        context.close();
    }
}
