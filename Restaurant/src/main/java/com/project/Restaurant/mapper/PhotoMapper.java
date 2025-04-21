package com.project.Restaurant.mapper;

import com.project.Restaurant.domain.dto.PhotoDto;
import com.project.Restaurant.domain.entity.Photo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PhotoMapper {
    PhotoDto toDto(Photo photo);
    Photo toEntity(PhotoDto photoDto);
}
