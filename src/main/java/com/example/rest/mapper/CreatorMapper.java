package com.example.rest.mapper;

import com.example.rest.dto.CreatorRequestTo;
import com.example.rest.dto.CreatorResponseTo;
import com.example.rest.entity.Creator;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface CreatorMapper {
    Creator toEntity(CreatorRequestTo request);
    CreatorResponseTo toResponse(Creator creator);
    @Mapping(target = "id", ignore = true) // ID не меняем
    void updateEntity(CreatorRequestTo request, @MappingTarget Creator creator);
}
