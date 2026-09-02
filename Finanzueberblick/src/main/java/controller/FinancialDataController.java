package controller;

import Model.DTO.GoalDTO;
import Service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class FinancialDataController {
    @Autowired
    GoalService goalService;
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
}

