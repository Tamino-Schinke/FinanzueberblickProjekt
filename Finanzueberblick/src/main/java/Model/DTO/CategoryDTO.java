package Model.DTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CategoryDTO {
    private Long id;
    private String category;
    private double priceLimit;
    private double spentSoFar;
    public CategoryDTO(Long id, String category)
    {
        this.id = id;
        this.category = category;
    }
    public CategoryDTO(Long id, String category,double priceLimit, double spentSoFar)
    {
        this.id = id;
        this.category = category;
        this.priceLimit = priceLimit;
        this.spentSoFar = spentSoFar;
    }
}
