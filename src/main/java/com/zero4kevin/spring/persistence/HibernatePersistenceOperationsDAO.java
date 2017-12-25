package com.zero4kevin.spring.persistence;

import com.zero4kevin.spring.persistence.interfaces.PersistenceOperationsDAO;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by xi1zhang on 2017/11/27.
 */
public class HibernatePersistenceOperationsDAO implements PersistenceOperationsDAO {
    private SessionFactory session;
    private final String table="personal_information";

    public Object query(int id) {
        String sql="from "+table + " where id=" +id;
        return session.openSession().createQuery(sql).uniqueResult();
    }

    public List queryAll() {
        String sql="from "+table;
        return session.openSession().createQuery(sql).getResultList();
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        
    }

    public List query() {
        return null;
    }

    public void insert(Object object) {

    }

    public void delete(int id) {

    }

    public void update(Object object) {

    }

    public SessionFactory getSession() {
        return session;
    }

    public void setSession(SessionFactory session) {
        this.session = session;
    }
}
