package com.zero4kevin.spring.persistence;

import com.zero4kevin.spring.persistence.interfaces.PersistenceOperationsDAO;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.*;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xi1zhang on 2017/11/22.
 */
public class JdbcPersistenceOperationsDAO implements PersistenceOperationsDAO{
    private final String table="personal_information";
    private final String queryAll="select * from "+ table;
    private final String insertSql="insert into " + table + "(id, fname, gname,address) values (:id, :fname:, gname:, address)";
    private  JdbcTemplate jdbcTemplate;


    private DataSource dataSource=null;

//    public void setDataSource(DataSource dataSource) {
//        this.dataSource=dataSource;
//    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }


    public List<Object> query() {
        List persons=new ArrayList();
        PersonDetial person=null;
        persons= jdbcTemplate.query(queryAll, new RowMapper<PersonDetial>() {
            public 
        });
        return persons;
    }

    public void insert(Object object) {

    }

    public void delete(int id) {

    }


    public void update(Object object) {

    }
}
