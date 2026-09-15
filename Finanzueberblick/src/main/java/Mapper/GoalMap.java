package Mapper;

import Model.DTO.GoalDTO;
import Model.Entity.GoalEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface GoalMap {
    GoalEntity toEntity (GoalDTO goalDTO);
    List<GoalEntity> toEntityList(List<GoalDTO> goalDTOList);
    GoalDTO toDTO (GoalEntity goalEntity);
    List<GoalDTO> toDTOList(List<GoalEntity> goalEntityList);
}
