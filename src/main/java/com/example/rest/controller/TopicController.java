package com.example.rest.controller;

import com.example.rest.dto.TopicRequestTo;
import com.example.rest.dto.TopicResponseTo;
import com.example.rest.service.TopicService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1.0/topics")
public class TopicController {
    private final TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<TopicResponseTo> getTopic(@PathVariable Long id) {
        return ResponseEntity.ok(topicService.getById(id));
    }

    @PostMapping
    public ResponseEntity<TopicResponseTo> createTopic(@RequestBody TopicRequestTo request) {
        return ResponseEntity.ok(topicService.create(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TopicResponseTo> updateTopic(@PathVariable Long id, @RequestBody TopicRequestTo request) {
        return ResponseEntity.ok(topicService.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTopic(@PathVariable Long id) {
        topicService.delete(id);
        return ResponseEntity.noContent().build();
    }
}