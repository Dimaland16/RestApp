package com.example.rest.repository;

import com.example.rest.entity.Creator;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CreatorRepository implements CrudRepository<Creator, Long> {
    private final Map<Long, Creator> storage = new HashMap<>();

    @Override
    public Creator findById(Long id) {
        return storage.get(id);
    }

    @Override
    public List<Creator> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void save(Creator creator) {
        storage.put(creator.getId(), creator);
    }

    public void update(Creator creator) {
        if (storage.containsKey(creator.getId())) {
            storage.put(creator.getId(), creator);
        }
    }

    @Override
    public void deleteById(Long id) {
        storage.remove(id);
    }
}
