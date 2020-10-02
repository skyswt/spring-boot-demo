package edu.zju.cst.spring.demo.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		System.out.println("bean-demoListener 接收到了bean-demoPublisher发布的消息" + msg);
	}

}
