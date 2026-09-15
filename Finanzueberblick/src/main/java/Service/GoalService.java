package Service;

import Mapper.GoalMap;
import Model.DTO.GoalDTO;
import Model.Entity.CategoryEntity;
import Model.Entity.GoalEntity;
import Repository.CategoryRepository;
import Repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GoalService {

    @Autowired
    GoalEntity goalEntity;
    @Autowired
    private GoalMap goalMap;
    private GoalRepository goalRepo;
    private CategoryRepository categoryRepo;
    private Optional<CategoryEntity> existingCategory;
    private CategoryEntity category;
public List<GoalDTO> savingNewGoals(List<GoalDTO> allInputGoals)
{
    List<GoalEntity> goalEntityList = goalMap.toEntityList(allInputGoals);
    for (GoalEntity goalEntity : goalEntityList){
        existingCategory = categoryRepo.findByCategory(goalEntity.getCategory());
        if(existingCategory.isEmpty()) {
            category = new CategoryEntity(goalEntity.getCategory());
            categoryRepo.save(category);
        }
    }
   goalRepo.saveAll(goalEntityList);
   return goalMap.toDTOList(goalEntityList);
}
public GoalDTO getGoalById(Long id)
{
   goalEntity = goalRepo.findById(id).orElseThrow(RuntimeException::new);
   return goalMap.toDTO(goalEntity);
}

}
