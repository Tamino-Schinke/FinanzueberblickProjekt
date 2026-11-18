package finanzueberblick.Service;

import finanzueberblick.Mapper.GoalMap;
import finanzueberblick.Model.DTO.GoalDTO;
import finanzueberblick.Model.Entity.CategoryEntity;
import finanzueberblick.Model.Entity.GoalEntity;
import finanzueberblick.Repository.CategoryRepository;
import finanzueberblick.Repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GoalService {
    GoalEntity goalEntity;
    @Autowired
    private GoalMap goalMap;
    @Autowired
    private GoalRepository goalRepo;
    @Autowired
    private CategoryRepository categoryRepo;
    private Optional<CategoryEntity> existingCategory;
    private CategoryEntity category;
public List<GoalDTO> savingNewGoals(List<GoalDTO> allInputGoals)
{
    List<GoalEntity> goalEntityList = goalMap.toEntityList(allInputGoals);
    for (GoalEntity goalEntity : goalEntityList){
        existingCategory = categoryRepo.findByCategory(goalEntity.getCategory());
        if(existingCategory.isEmpty()) {
            category = CategoryEntity.builder()
                    .category(goalEntity.getCategory()).build();
            saveNewCategory(category);
        }
    }
   goalRepo.saveAll(goalEntityList);
   return goalMap.toDTOList(goalEntityList);
}
public void saveNewCategory(CategoryEntity category) {

    categoryRepo.save(category);
}
public GoalDTO getGoalById(Long id)
{
   goalEntity = goalRepo.findById(id).orElseThrow(RuntimeException::new);
   return goalMap.toDTO(goalEntity);
}

}
