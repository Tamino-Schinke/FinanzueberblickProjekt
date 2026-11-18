package finanzueberblick.service;

import finanzueberblick.mapper.IGoalMap;
import finanzueberblick.model.dto.GoalDTO;
import finanzueberblick.model.entity.CategoryEntity;
import finanzueberblick.model.entity.GoalEntity;
import finanzueberblick.repository.CategoryRepository;
import finanzueberblick.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GoalService {
    GoalEntity goalEntity;
    @Autowired
    private IGoalMap goalMap;
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
