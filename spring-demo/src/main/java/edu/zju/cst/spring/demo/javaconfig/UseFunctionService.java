package edu.zju.cst.spring.demo.javaconfig;


public class UseFunctionService {
    private final FunctionService functionService;

    public UseFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word + "2");
    }
}
