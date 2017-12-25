package com.zero4kevin.spring.persistence.interfaces;

import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import java.util.Map;

/**
 * Created by xi1zhang on 2017/11/24.
 */
public interface PersistenceOperationsDAO {
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate);

    public List query();

    public void insert(Object object);

    public void delete(int id);

    public void update(Object object);
}
