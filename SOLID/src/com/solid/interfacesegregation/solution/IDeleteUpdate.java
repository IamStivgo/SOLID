package com.solid.interfacesegregation.solution;

public interface IDeleteUpdate<T> {
    void update(T entity);
    void delete(T entity);
}
