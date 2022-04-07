package com.solid.interfacesegregation.problem;

import java.util.List;

public interface ICrud<T> {
    T get(int id);
    List<T> getList();
    void add(T entity);
    void update(T entity);
    void delete(T entity);
}
