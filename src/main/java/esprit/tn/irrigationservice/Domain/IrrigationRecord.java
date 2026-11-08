package esprit.tn.irrigationservice.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "irrigation_records")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IrrigationRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime irrigationDate;

    private Double waterQuantity;

    private Double duration;

    private String notes;

    @Enumerated(EnumType.STRING)
    private IrrigationStatus status;

    @ManyToOne
    @JoinColumn(name = "irrigation_plan_id")
    private IrrigationPlan irrigationPlan;
}
