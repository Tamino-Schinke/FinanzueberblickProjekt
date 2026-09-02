package Model.DTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
@Builder
@Getter
@Setter
public class GoalDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private boolean alreadyPaid;
    @NotNull
    private String category;
    @CreationTimestamp
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
