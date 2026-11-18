package finanzueberblick.Mapper;

import finanzueberblick.Model.DTO.CategoryDTO;
import finanzueberblick.Model.Entity.CategoryEntity;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface CategoryMap {
    CategoryEntity toEntity(CategoryDTO categoryDTO);
    CategoryDTO toDTO(CategoryEntity entity);

    List<CategoryEntity> toEntityList(List<CategoryDTO> dtos);

    List<CategoryDTO> toDTOs(List<CategoryEntity> entities);
    }

