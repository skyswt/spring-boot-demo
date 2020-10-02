package edu.zju.cst.spring.demo.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {

	private final ApplicationContext applicationContext;

	@Autowired
	public DemoPublisher(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	public void publish(String msg){
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}

}
