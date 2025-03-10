package com.example.rest.repository;

import com.example.rest.entity.Tag;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TagRepository implements CrudRepository<Tag, Long> {
    private final Map<Long, Tag> storage = new HashMap<>();

    @Override
    public Tag findById(Long id) {
        return storage.get(id);
    }

    @Override
    public List<Tag> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void save(Tag tag) {
        storage.put(tag.getId(), tag);
    }

    public void update(Tag tag) {
        if (storage.containsKey(tag.getId())) {
            storage.put(tag.getId(), tag);
        }
    }

    @Override
    public void deleteById(Long id) {
        storage.remove(id);
    }
}