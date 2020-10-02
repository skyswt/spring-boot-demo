package edu.zju.cst.spring.demo.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("edu.zju.cst.spring.demo.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {

}
