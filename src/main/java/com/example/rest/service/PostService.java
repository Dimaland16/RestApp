package com.example.rest.service;

import com.example.rest.dto.PostRequestTo;
import com.example.rest.dto.PostResponseTo;
import com.example.rest.entity.Post;
import com.example.rest.mapper.PostMapper;
import com.example.rest.repository.PostRepository;
import org.springframework.stereotype.Service;


@Service
public class PostService {
    private final PostRepository repository;
    private final PostMapper mapper;

    public PostService(PostRepository repository, PostMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public PostResponseTo getById(Long id) {
        return mapper.toResponse(repository.findById(id));
    }

    public PostResponseTo create(PostRequestTo request) {
        Post post = mapper.toEntity(request);
        repository.save(post);
        return mapper.toResponse(post);
    }

    public PostResponseTo update(Long id, PostRequestTo request) {
        Post post = repository.findById(id);
        mapper.updateEntity(request, post);
        repository.save(post);
        return mapper.toResponse(post);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
