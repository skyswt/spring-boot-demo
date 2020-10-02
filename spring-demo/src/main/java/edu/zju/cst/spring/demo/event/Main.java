package edu.zju.cst.spring.demo.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {

	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
		 DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
		 demoPublisher.publish("收到请回答？");
		 context.publishEvent(new DemoEvent(context, "收到"));
		 context.close();
	}
}
