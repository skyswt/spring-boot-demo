package edu.zju.cst.spring.demo.init;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
	@PostConstruct //1
    public void init2(){
        System.out.println("jsr250-init-method");
    }
    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy //2
    public void destroy2(){
        System.out.println("jsr250-destory-method");
    }

}
