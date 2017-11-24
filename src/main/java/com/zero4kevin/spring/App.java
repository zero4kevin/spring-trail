package com.zero4kevin.spring;

import com.zero4kevin.spring.performance.exceptions.PerformanceException;
import com.zero4kevin.spring.performance.interfaces.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.xml.transform.Result;
import java.sql.*;

/**
 * Created by xi1zhang on 2017/10/11.
 */
public class App {
    public static void main(String[] args) throws PerformanceException{
//        ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/zero4kevin/spring/spring-annotationwiring.xml");
//        ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/zero4kevin/spring/spring-aop.xml");
//
//        Performer performer=(Performer)ctx.getBean("kenny");
//        performer.perform();

//        ctx=new FileSystemXmlApplicationContext("src/main/java/com/zero4kevin/spring/spring-trial.xml");
//        performer=(Performer)ctx.getBean("poeticDuke");
//        performer.perform();
        String querySqlStatement="select * from personal_information";
        try{
            Class.forName("org.h2.Driver");
            Connection connection=DriverManager.getConnection("jdbc:h2:~/test", "sa","");
            PreparedStatement statement=connection.prepareStatement(querySqlStatement);
            ResultSet results=statement.executeQuery();
            while(results.next()){
                System.out.println(results.getInt("id") +" " +
                                   results.getString("fname")+ " " +
                                   results.getString("gname")+ " " +
                                   results.getString("address"));
            }
        }catch (Exception e){
           e.printStackTrace();
        }
    }
}
