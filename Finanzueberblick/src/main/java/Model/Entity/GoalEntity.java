package Model.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
public class GoalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean alreadyPaid;
    //@ForeignKey("")
    @NotNull

    private String category;
    @NotNull
    private LocalDateTime dateOfRegestration;
    private String intendedUse;
    public GoalEntity(Long id, boolean alreadyPaid, String category, LocalDateTime dateOfRegestration){
        this.id = id;
        this.alreadyPaid=alreadyPaid;
        this.category=category;
        this.dateOfRegestration=dateOfRegestration;
    }
    public GoalEntity(Long id, boolean alreadyPaid, String category, LocalDateTime dateOfRegestration, String intendedUse){
        this.id = id;
        this.alreadyPaid=alreadyPaid;
        this.category=category;
        this.dateOfRegestration=dateOfRegestration;
        this.intendedUse=intendedUse;
    }
}
