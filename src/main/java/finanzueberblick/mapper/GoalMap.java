package finanzueberblick.mapper;

import finanzueberblick.model.dto.GoalDTO;
import finanzueberblick.model.entity.GoalEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GoalMap {
    GoalEntity toEntity (GoalDTO goalDTO);
    List<GoalEntity> toEntityList(List<GoalDTO> goalDTOList);
    GoalDTO toDTO (GoalEntity goalEntity);
    List<GoalDTO> toDTOList(List<GoalEntity> goalEntityList);
}
