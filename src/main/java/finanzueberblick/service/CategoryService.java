package finanzueberblick.service;

import finanzueberblick.mapper.CategoryMap;
import finanzueberblick.model.dto.CategoryDTO;
import finanzueberblick.model.entity.CategoryEntity;
import finanzueberblick.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    GoalService goalService;
    @Autowired
    private CategoryRepository categoryRepo;
    @Autowired
    private CategoryMap categoryMap;


    public List<CategoryDTO> savingNewCategorys(List<CategoryDTO> categorys) {
      List<CategoryEntity>  categoryEntities = categoryMap.toEntityList(categorys);
        for (CategoryEntity category : categoryEntities) {
            if (categoryRepo.findByCategory(category.getCategory()).isEmpty()) {
                goalService.saveNewCategory(category);
            }
        }
        return categoryMap.toDTOs(categoryEntities);
    }
    public List<CategoryDTO> getAll(){
     List<CategoryEntity> categoryEntities =  categoryRepo.findAll();
        return categoryMap.toDTOs(categoryEntities);
    }
    }
