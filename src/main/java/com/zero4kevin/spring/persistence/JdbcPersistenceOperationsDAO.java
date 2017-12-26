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
import org.springframework.jdbc.core.support.JdbcDaoSupport;
/**
 * Created by xi1zhang on 2017/11/22.
 */
public class JdbcPersistenceOperationsDAO extends JdbcDaoSupport implements PersistenceOperationsDAO{
    private final String table="PERSONAL_INFORMATION";
    private final String insertSql="insert into " + table + "(id, fname, gname,address) values (:id, :fname:, gname:, address)";

    public List queryAll() {
        final String sql="select * from "+ table;
//        return getJdbcTemplate().queryForList(sql);
        return null;
    }

    public List query() {
        String queryAll="select * from "+ table;
//        return getJdbcTemplate().queryForList(queryAll);
        return null;
    }


    public List query(int id) {
        return null;
    }

    public void insert(Object object) {
        final String insertSql="insert into " + table + "(id, fname, gname,address) values (:id, :fname:, gname:, address)";
    }

    public void delete(int id) {

    }


    public void update(Object object) {
    }

}
