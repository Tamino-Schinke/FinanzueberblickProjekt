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
   public CategoryDTO(String category)
    {
        this.category = category;
    }
    public CategoryDTO(String category,double priceLimit, double spentSoFar)
    {
        this.category = category;
        this.priceLimit = priceLimit;
        this.spentSoFar = spentSoFar;
    }
    public CategoryDTO(Long id, String category,double priceLimit, double spentSoFar)
    {
        this.id = id;
        this.category = category;
        this.priceLimit = priceLimit;
        this.spentSoFar = spentSoFar;
    }
}
