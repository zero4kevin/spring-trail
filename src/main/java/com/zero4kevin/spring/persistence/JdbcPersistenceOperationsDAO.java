package com.zero4kevin.spring.persistence;

import com.zero4kevin.spring.persistence.interfaces.PersistenceOperationsDAO;
import java.util.List;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
/**
 * Created by xi1zhang on 2017/11/22.
 */
public class JdbcPersistenceOperationsDAO extends JdbcDaoSupport implements PersistenceOperationsDAO{
    private final String table="PERSONAL_INFORMATION";
    private final String insertSql="insert into " + table + "(id, fname, gname,address) values (:id, :fname:, gname:, address)";


    public List query() {
        String queryAll="select * from "+ table;
        return getJdbcTemplate().queryForList(queryAll);
    }

    public void insert(Object object) {

    }

    public void delete(int id) {

    }


    public void update(Object object) {

    }
}
