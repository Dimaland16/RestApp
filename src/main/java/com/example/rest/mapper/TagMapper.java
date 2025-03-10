package com.example.rest.mapper;

import com.example.rest.dto.CreatorRequestTo;
import com.example.rest.dto.TagRequestTo;
import com.example.rest.dto.TagResponseTo;
import com.example.rest.entity.Creator;
import com.example.rest.entity.Tag;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface TagMapper {
    Tag toEntity(TagRequestTo request);
    TagResponseTo toResponse(Tag tag);

    @Mapping(target = "id", ignore = true) // ID не меняем
    void updateEntity(TagRequestTo request, @MappingTarget Tag tag);
}
