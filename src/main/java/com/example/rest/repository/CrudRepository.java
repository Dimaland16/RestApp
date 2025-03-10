package com.example.rest.repository;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T, ID> {
    T findById(ID id);
    List<T> findAll();
    void save(T entity);
    void deleteById(ID id);
}