/*
package com.example.rest.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

abstract class InMemoryRepository<T, ID> implements CrudRepository<T, ID> {
    protected final Map<ID, T> storage = new ConcurrentHashMap<>();
    protected final AtomicLong idGenerator = new AtomicLong(1);

    @Override
    public T save(T entity) {
        storage.put(getId(entity), entity);
        return entity;
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void deleteById(ID id) {
        storage.remove(id);
    }

    protected abstract ID getId(T entity);
}

*/
