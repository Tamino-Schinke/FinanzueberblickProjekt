package Model.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String category;
    @NotNull
    private double priceLimit;
    private double spentSoFar;
    public CategoryEntity(Long id, String category)
    {
        this.id = id;
        this.category = category;
    }
    public CategoryEntity(Long id, String category, double priceLimit, double spentSoFar)
    {
        this.id = id;
        this.category = category;
        this.priceLimit = priceLimit;
        this.spentSoFar = spentSoFar;
    }
}
