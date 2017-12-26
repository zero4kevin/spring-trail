package com.zero4kevin.spring;

import com.zero4kevin.spring.performance.exceptions.PerformanceException;
import com.zero4kevin.spring.persistence.interfaces.PersistenceOperationsDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Iterator;
import java.util.List;

/**
 * Created by xi1zhang on 2017/10/11.
 */
public class PersistenceDemo {
    public static void main(String[] args){
        ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/zero4kevin/spring/spring.xml");
        PersistenceOperationsDAO dao=(PersistenceOperationsDAO)ctx.getBean("testJdbcTemplateDAO");
//        List<Object> list=dao.query();
//        Iterator iterator=list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
