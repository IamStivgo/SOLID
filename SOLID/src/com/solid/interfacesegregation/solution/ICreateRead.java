package com.solid.interfacesegregation.solution;

import java.util.List;

public interface ICreateRead<T> {
    T get(int id);
    List<T> getList();
    void add(T entity);
}
