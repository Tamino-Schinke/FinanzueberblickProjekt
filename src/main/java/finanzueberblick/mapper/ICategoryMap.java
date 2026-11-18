package finanzueberblick.mapper;

import finanzueberblick.model.dto.CategoryDTO;
import finanzueberblick.model.entity.CategoryEntity;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface ICategoryMap {
    CategoryEntity toEntity(CategoryDTO categoryDTO);
    CategoryDTO toDTO(CategoryEntity entity);

    List<CategoryEntity> toEntityList(List<CategoryDTO> dtos);

    List<CategoryDTO> toDTOs(List<CategoryEntity> entities);
    }

