package com.zero4kevin.spring.persistence;

import com.zero4kevin.spring.persistence.interfaces.PersistenceOperationsDAO;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.*;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xi1zhang on 2017/11/22.
 */
public class JdbcPersistenceOperationsDAO  extends org.springframework.jdbc.core.support.JdbcDaoSupport implements PersistenceOperationsDAO{
    private final String table="personal_information";

    public Object query(int id) {
        final String sql="select * from " + table + " where id ="+id;
        return getJdbcTemplate().query(sql, new ResultSetExtractor<PersonDetial>() {
            public PersonDetial extractData(ResultSet rs){
                PersonDetial person=new PersonDetial();
                try{
                    person.setId(rs.getInt(1));
                    person.setFname(rs.getString(2));
                    person.setGname(rs.getString(3));
                    person.setAddress(rs.getString(4));
                }catch (SQLException e){
                    e.printStackTrace();
                    person.setId(0);
                    person.setFname("default");
                    person.setGname("default");
                    person.setAddress("default");
                }
                return person;
            }
        });
    }

    public List queryAll() {
        final String sql="select * from "+ table;
        return getJdbcTemplate().queryForList(sql);
    }

    public List<Object> query() {
        List persons=new ArrayList();
        PersonDetial person=null;;
        return persons;
    }

    public void insert(Object object) {
        final String insertSql="insert into " + table + "(id, fname, gname,address) values (:id, :fname:, gname:, address)";
    }

    public void delete(int id) {

    }


    public void update(Object object) {
    }
}
