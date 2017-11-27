package com.zero4kevin.spring;

import com.zero4kevin.spring.persistence.interfaces.PersistenceOperationsDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Iterator;

/**
 * Created by xi1zhang on 2017/11/27.
 */
public class PersistenceDaoDemo {
    public static void main(String[] args){
        ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/com/zero4kevin/spring/spring.xml");
        PersistenceOperationsDAO operationsDAO=(PersistenceOperationsDAO) context.getBean("testJdbcTemplateDAO");
//        System.out.println(operationsDAO.query(123));
        Iterator iterator=operationsDAO.queryAll().iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
