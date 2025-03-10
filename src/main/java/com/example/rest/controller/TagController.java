package com.example.rest.controller;

import com.example.rest.dto.TagRequestTo;
import com.example.rest.dto.TagResponseTo;
import com.example.rest.service.TagService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1.0/tags")
public class TagController {
    private final TagService tagService;

    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<TagResponseTo> getTag(@PathVariable Long id) {
        return ResponseEntity.ok(tagService.getById(id));
    }

    @PostMapping
    public ResponseEntity<TagResponseTo> createTag(@RequestBody TagRequestTo request) {
        return ResponseEntity.ok(tagService.create(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TagResponseTo> updateTag(@PathVariable Long id, @RequestBody TagRequestTo request) {
        return ResponseEntity.ok(tagService.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTag(@PathVariable Long id) {
        tagService.delete(id);
        return ResponseEntity.noContent().build();
    }
}