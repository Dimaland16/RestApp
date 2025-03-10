package com.example.rest.mapper;

import com.example.rest.dto.CreatorRequestTo;
import com.example.rest.dto.PostRequestTo;
import com.example.rest.dto.PostResponseTo;
import com.example.rest.entity.Creator;
import com.example.rest.entity.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface PostMapper {
    @Mapping(source = "topicId", target = "topic.id")
    Post toEntity(PostRequestTo request);

    @Mapping(source = "topic.id", target = "topicId")
    PostResponseTo toResponse(Post post);

    @Mapping(target = "id", ignore = true) // ID не меняем
    void updateEntity(PostRequestTo request, @MappingTarget Post post);
}