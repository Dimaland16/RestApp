package com.example.rest.service;

import com.example.rest.dto.CreatorRequestTo;
import com.example.rest.dto.CreatorResponseTo;
import com.example.rest.entity.Creator;
import com.example.rest.mapper.CreatorMapper;
import com.example.rest.repository.CreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CreatorService {
    private final CreatorRepository repository;
    private final CreatorMapper mapper;

    @Autowired
    public CreatorService(CreatorRepository repository, CreatorMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public CreatorResponseTo getById(Long id) {
        return mapper.toResponse(repository.findById(id));
    }

    public CreatorResponseTo create(CreatorRequestTo request) {
        Creator creator = mapper.toEntity(request);
        repository.save(creator);
        return mapper.toResponse(creator);
    }

    public CreatorResponseTo update(Long id, CreatorRequestTo request) {
        Creator creator = repository.findById(id);
        mapper.updateEntity(request, creator);
        repository.save(creator);
        return mapper.toResponse(creator);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}