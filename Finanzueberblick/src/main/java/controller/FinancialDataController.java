package controller;

import Model.DTO.CategoryDTO;
import Model.DTO.GoalDTO;
import Repository.CategoryRepository;
import Service.CategoryService;
import Service.GoalService;
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
    @PostMapping
    public List<GoalDTO> savingGoal(@RequestBody List<GoalDTO> goalDTOList)
    {
   return goalService.savingNewGoals(goalDTOList);
    }
    @GetMapping("getGoal/{id}")
    public GoalDTO getSavingGoalById(@PathVariable Long id)
    {
    return goalService.getGoalById(id);
    }
    @PostMapping
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

