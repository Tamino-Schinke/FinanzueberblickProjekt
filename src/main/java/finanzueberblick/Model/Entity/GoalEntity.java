package finanzueberblick.Model.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GoalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean alreadyPaid;
    @NotNull
    private String category;
    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime dateOfRegestration;
    private String intendedUse;
}
