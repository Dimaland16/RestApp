package com.example.rest.service;

import com.example.rest.dto.TopicRequestTo;
import com.example.rest.dto.TopicResponseTo;
import com.example.rest.entity.Topic;
import com.example.rest.mapper.TopicMapper;
import com.example.rest.repository.TopicRepository;
import org.springframework.stereotype.Service;


@Service
public class TopicService {
    private final TopicRepository repository;
    private final TopicMapper mapper;

    public TopicService(TopicRepository repository, TopicMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public TopicResponseTo getById(Long id) {
        return mapper.toResponse(repository.findById(id));
    }

    public TopicResponseTo create(TopicRequestTo request) {
        Topic topic = mapper.toEntity(request);
        repository.save(topic);
        return mapper.toResponse(topic);
    }

    public TopicResponseTo update(Long id, TopicRequestTo request) {
        Topic topic = repository.findById(id);
        mapper.updateEntity(request, topic);
        repository.save(topic);
        return mapper.toResponse(topic);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}