package com.example.rest.сontroller;

import com.example.rest.dto.CreatorRequestTo;
import com.example.rest.dto.CreatorResponseTo;
import com.example.rest.service.CreatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1.0/creators")
public class CreatorController {
    private final CreatorService creatorService;

    public CreatorController(CreatorService creatorService) {
        this.creatorService = creatorService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CreatorResponseTo> getCreator(@PathVariable Long id) {
        return ResponseEntity.ok(creatorService.getById(id));
    }

    @PostMapping
    public ResponseEntity<CreatorResponseTo> createCreator(@RequestBody CreatorRequestTo request) {
        return ResponseEntity.ok(creatorService.create(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CreatorResponseTo> updateCreator(@PathVariable Long id, @RequestBody CreatorRequestTo request) {
        return ResponseEntity.ok(creatorService.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCreator(@PathVariable Long id) {
        creatorService.delete(id);
        return ResponseEntity.noContent().build();
    }
}