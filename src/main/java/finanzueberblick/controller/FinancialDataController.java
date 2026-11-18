package finanzueberblick.controller;

import finanzueberblick.model.dto.CategoryDTO;
import finanzueberblick.model.dto.GoalDTO;
import finanzueberblick.repository.CategoryRepository;
import finanzueberblick.service.CategoryService;
import finanzueberblick.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class FinancialDataController {
    @Autowired
    GoalService goalService;
    @Autowired
    CategoryService categoryService;
    @Autowired
    private CategoryRepository categoryRepository;
    @PostMapping("/post_goals_with_first_Category")
    public List<GoalDTO> savingGoal(@RequestBody List<GoalDTO> goalDTOList)
    {
   return goalService.savingNewGoals(goalDTOList);
    }
    @GetMapping("getGoal/{id}")
    public GoalDTO getSavingGoalById(@PathVariable Long id)
    {
    return goalService.getGoalById(id);
    }
    @PostMapping("/postCategorys")
    public List<CategoryDTO> savingCategorys(@RequestBody List<CategoryDTO> categoryDTOList){
        return categoryService.savingNewCategorys(categoryDTOList);
    }
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryRepository.deleteById(id);
    }
    @GetMapping("getCategorys")
    public List<CategoryDTO> getAllCategorys(){
        return categoryService.getAll();
    }

}

