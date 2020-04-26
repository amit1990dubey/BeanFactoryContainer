package com.ibm.spring;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Lab37 {

    public static void main(String[] args) {


        Resource res = new ClassPathResource("web.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        System.out.println("Spring Container is Ready.....");
        System.out.println("................");

        Hello hello = (Hello)factory.getBean("hello");
        hello.show();
        System.out.println("................");
        System.out.println("Spring Container is shutdown .....");



    }
}
