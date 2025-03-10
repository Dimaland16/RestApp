package com.example.rest.mapper;

import com.example.rest.dto.CreatorRequestTo;
import com.example.rest.dto.TopicRequestTo;
import com.example.rest.dto.TopicResponseTo;
import com.example.rest.entity.Creator;
import com.example.rest.entity.Topic;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface TopicMapper {
    @Mapping(source = "creatorId", target = "creator.id")
    Topic toEntity(TopicRequestTo request);

    @Mapping(source = "creator.id", target = "creatorId")
    TopicResponseTo toResponse(Topic topic);

    @Mapping(target = "id", ignore = true) // ID не меняем
    void updateEntity(TopicRequestTo request, @MappingTarget Topic topic);
}