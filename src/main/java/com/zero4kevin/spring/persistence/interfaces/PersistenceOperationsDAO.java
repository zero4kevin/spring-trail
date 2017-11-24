package com.zero4kevin.spring.persistence.interfaces;

import javax.sql.DataSource;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * Created by xi1zhang on 2017/11/24.
 */
public interface PersistenceOperationsDAO {
    public void setDataSource(DataSource dataSource);

    public List<Object> query();

    public void insert(Object object);

    public void delete(int id);

    public void update(Object object);
}
