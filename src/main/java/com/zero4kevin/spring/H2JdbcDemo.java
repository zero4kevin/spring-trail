package com.zero4kevin.spring;

import com.zero4kevin.spring.performance.exceptions.PerformanceException;
import com.zero4kevin.spring.persistence.interfaces.PersistenceOperationsDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;

/**
 * Created by xi1zhang on 2017/10/11.
 */
public class H2JdbcDemo {
    public static void main(String[] args) throws PerformanceException{
        String querySqlStatement="select * from PERSONAL_INFORMATION";
        try{
            Class.forName("org.h2.Driver");
            Connection connection= DriverManager.getConnection("jdbc:h2:~/test", "sa","");
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
