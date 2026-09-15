package Mapper;

import Model.DTO.CategoryDTO;
import Model.DTO.GoalDTO;
import Model.Entity.CategoryEntity;
import Model.Entity.GoalEntity;
import Service.CategoryService;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface CategoryMap {
    CategoryDTO toEntity(CategoryEntity categoryEntity);
    CategoryDTO toDTO(CategoryEntity entity);

    List<CategoryEntity> toEntities(List<CategoryDTO> dtos);

    List<CategoryDTO> toDTOs(List<CategoryEntity> entities);
    }

