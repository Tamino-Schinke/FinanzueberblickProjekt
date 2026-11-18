package finanzueberblick.Mapper;

import finanzueberblick.Model.DTO.GoalDTO;
import finanzueberblick.Model.Entity.GoalEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GoalMap {
    GoalEntity toEntity (GoalDTO goalDTO);
    List<GoalEntity> toEntityList(List<GoalDTO> goalDTOList);
    GoalDTO toDTO (GoalEntity goalEntity);
    List<GoalDTO> toDTOList(List<GoalEntity> goalEntityList);
}
