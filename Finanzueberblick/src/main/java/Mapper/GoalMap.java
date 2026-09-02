package Mapper;

import Model.DTO.GoalDTO;
import Model.Entity.GoalEntity;

import java.util.List;

public class GoalMap {
    public static GoalEntity toEntity (GoalDTO goalDTO){
        return  GoalEntity.builder()
                .id(goalDTO.getId())
                .alreadyPaid(goalDTO.isAlreadyPaid())
                .category(goalDTO.getCategory())
                .dateOfRegestration(goalDTO.getDateOfRegestration())
                .build();
    }
    public List<GoalEntity> toEntityList(List<GoalDTO> goalDTOList){
    return goalDTOList.stream().map(GoalMap:: toEntity).toList();
    }
    public static GoalDTO toDTO (GoalEntity goalEntity){
        return GoalDTO.builder()
                .id(goalEntity.getId())
                .alreadyPaid(goalEntity.isAlreadyPaid())
                .category(goalEntity.getCategory())
                .dateOfRegestration(goalEntity.getDateOfRegestration())
                .build();
    }
    public List<GoalDTO> toDTOList(List<GoalEntity> goalEntityList){
        return goalEntityList.stream().map(GoalMap:: toDTO).toList();
    }
}
