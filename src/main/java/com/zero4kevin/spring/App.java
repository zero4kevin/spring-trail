package com.zero4kevin.spring;

import com.zero4kevin.spring.performance.exceptions.PerformanceException;
import com.zero4kevin.spring.performance.interfaces.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by xi1zhang on 2017/10/11.
 */
public class App {
    public static void main(String[] args) throws PerformanceException{
//        ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/zero4kevin/spring/spring-annotationwiring.xml");
        ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/zero4kevin/spring/spring-aop.xml");

        Performer performer=(Performer)ctx.getBean("kenny");
        performer.perform();

//        ctx=new FileSystemXmlApplicationContext("src/main/java/com/zero4kevin/spring/spring-trial.xml");
//        performer=(Performer)ctx.getBean("poeticDuke");
//        performer.perform();
    }
}
