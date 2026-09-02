package Service;

import Mapper.CategoryMap;
import Model.DTO.CategoryDTO;
import Model.Entity.CategoryEntity;
import Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepo;
    private List<CategoryEntity> categoryEntities;
    @Autowired
    private CategoryMap categoryMap;

    public List<CategoryDTO> savingNewCategorys(List<CategoryDTO> categorys) {
        categoryEntities = categoryMap.toEntityList(categorys);
        for (CategoryEntity category : categoryEntities) {
            if (categoryRepo.findByCategory(category.getCategory()).isEmpty()) {
                categoryRepo.save(category);
            }
        }
        return categoryMap.toDTOList(categoryEntities);
    }

    }
