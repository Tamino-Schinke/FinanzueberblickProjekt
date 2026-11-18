package finanzueberblick.Model.DTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CategoryDTO {
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
}
