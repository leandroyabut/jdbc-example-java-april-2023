package com.smoothstack.jdbcapr2023.dao;

import com.smoothstack.jdbcapr2023.connection.ConnectionManager;

import java.util.List;
import java.util.Optional;

public abstract class BaseDAO<T, ID> {

    private final ConnectionManager connectionManager;

    public BaseDAO() {
        connectionManager = new ConnectionManager();
    }

    protected ConnectionManager getConnectionManager() {
        return connectionManager;
    }

    public abstract Optional<T> getById(ID id);
    public abstract List<T> getAll();
    public abstract T save(T t);

}
