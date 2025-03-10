package com.example.rest.repository;

import com.example.rest.entity.Topic;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TopicRepository implements CrudRepository<Topic, Long> {
    private final Map<Long, Topic> storage = new HashMap<>();

    @Override
    public Topic findById(Long id) {
        return storage.get(id);
    }

    @Override
    public List<Topic> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void save(Topic topic) {
        storage.put(topic.getId(), topic);
    }

    public void update(Topic topic) {
        if (storage.containsKey(topic.getId())) {
            storage.put(topic.getId(), topic);
        }
    }

    @Override
    public void deleteById(Long id) {
        storage.remove(id);
    }
}