package com.jy.entity;

import org.springframework.stereotype.Component;

@Component("std")
public class Student {

	public void display(){
        System.out.println("Object Loaded...");
    }
}
