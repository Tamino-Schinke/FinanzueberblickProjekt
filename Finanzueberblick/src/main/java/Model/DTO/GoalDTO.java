package Model.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Builder
@Getter
@Setter
public class GoalDTO {
    private Long id;
    private boolean alreadyPaid;
    private String category;
    private LocalDateTime dateOfRegestration;
    private String intendedUse;

    public GoalDTO(Long id, boolean alreadyPaid, String category, LocalDateTime dateOfRegestration)
    {
        this.id = id;
        this.alreadyPaid = alreadyPaid;
        this.category = category;
        this.dateOfRegestration=dateOfRegestration;
    }

    public GoalDTO(Long id, boolean alreadyPaid, String category, LocalDateTime dateOfRegestration, String intendedUse)
    {
        this.id = id;
        this.alreadyPaid = alreadyPaid;
        this.category = category;
        this.dateOfRegestration=dateOfRegestration;
        this.intendedUse=intendedUse;
    }

}
