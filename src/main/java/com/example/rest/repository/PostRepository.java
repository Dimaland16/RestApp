package com.example.rest.repository;

import com.example.rest.entity.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PostRepository implements CrudRepository<Post, Long> {
    private final Map<Long, Post> storage = new HashMap<>();

    @Override
    public Post findById(Long id) {
        return storage.get(id);
    }

    @Override
    public List<Post> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void save(Post post) {
        storage.put(post.getId(), post);
    }

    public void update(Post post) {
        if (storage.containsKey(post.getId())) {
            storage.put(post.getId(), post);
        }
    }

    @Override
    public void deleteById(Long id) {
        storage.remove(id);
    }
}
