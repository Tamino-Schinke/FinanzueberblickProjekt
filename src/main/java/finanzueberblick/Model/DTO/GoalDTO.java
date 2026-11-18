package finanzueberblick.Model.DTO;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Builder
@Getter
@Setter
@AllArgsConstructor
public class GoalDTO {
    private boolean alreadyPaid;
    @NotNull
    private String category;
    private LocalDateTime dateOfRegestration;
    private String intendedUse;

}