package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Suan;

public class Test {
public static void main(String[] args) {
ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
Hello hello1=(Hello) ac.getBean("hello1");

hello1.say();

Hello hello=(Hello) ac.getBean("hello");
hello.say();

Suan suan=(Suan) ac.getBean("suan");
System.out.println(suan.add(22, 1));
}
}
