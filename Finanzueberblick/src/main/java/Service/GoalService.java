package Service;

import Mapper.GoalMap;
import Model.DTO.GoalDTO;
import Model.Entity.GoalEntity;
import Repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoalService {

    @Autowired
    GoalEntity goalEntity;
    @Autowired
    private GoalMap goalMap;
    private GoalRepository debitRepo;
public List<GoalDTO> savingNewGoals(List<GoalDTO> allInputGoals)
{
    List<GoalEntity> goalEntityList = goalMap.toEntityList(allInputGoals);
   debitRepo.saveAll(goalEntityList);
   return goalMap.toDTOList(goalEntityList);
}
public GoalDTO getGoalById(Long id)
{
   goalEntity = debitRepo.findById(id).orElseThrow(RuntimeException::new);
   return GoalMap.toDTO(goalEntity);
}

}
