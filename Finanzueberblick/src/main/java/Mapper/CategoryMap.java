package Mapper;

import Model.DTO.CategoryDTO;
import Model.DTO.GoalDTO;
import Model.Entity.CategoryEntity;
import Model.Entity.GoalEntity;

import java.util.List;



public class CategoryMap {
        public static CategoryEntity toEntity (CategoryDTO categoryDTO){
            return  CategoryEntity.builder()
                    .category(categoryDTO.getCategory())
                    .priceLimit(categoryDTO.getPriceLimit())
                    .spentSoFar(categoryDTO.getSpentSoFar())
                    .build();
        }
    public static List<CategoryEntity> toEntityList(List<CategoryDTO> categoryDTOList){
        return categoryDTOList.stream().map(Mapper.CategoryMap:: toEntity).toList();
    }
        public static CategoryDTO toDTO (CategoryEntity categoryEntity){
            return  CategoryDTO.builder()
                    .category(categoryEntity.getCategory())
                    .priceLimit(categoryEntity.getPriceLimit())
                    .spentSoFar(categoryEntity.getSpentSoFar())
                    .build();
        }
        public static List<CategoryDTO> toDTOList(List<CategoryEntity> categoryEntityList){
            return categoryEntityList.stream().map(Mapper.CategoryMap:: toDTO).toList();
        }
    }

