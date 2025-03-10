package com.example.rest.service;

import com.example.rest.dto.TagRequestTo;
import com.example.rest.dto.TagResponseTo;
import com.example.rest.entity.Tag;
import com.example.rest.mapper.TagMapper;
import com.example.rest.repository.TagRepository;
import org.springframework.stereotype.Service;


@Service
public class TagService {
    private final TagRepository repository;
    private final TagMapper mapper;

    public TagService(TagRepository repository, TagMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public TagResponseTo getById(Long id) {
        return mapper.toResponse(repository.findById(id));
    }

    public TagResponseTo create(TagRequestTo request) {
        Tag tag = mapper.toEntity(request);
        repository.save(tag);
        return mapper.toResponse(tag);
    }

    public TagResponseTo update(Long id, TagRequestTo request) {
        Tag tag = repository.findById(id);
        mapper.updateEntity(request, tag);
        repository.save(tag);
        return mapper.toResponse(tag);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
