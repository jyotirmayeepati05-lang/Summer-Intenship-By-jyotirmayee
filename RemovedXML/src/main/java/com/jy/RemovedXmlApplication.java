package com.jy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jy.config.Config;
import com.jy.entity.Student;

public class RemovedXmlApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student stud = context.getBean("std", Student.class);
		System.out.println(stud.getClass());
		
	
	}

}
