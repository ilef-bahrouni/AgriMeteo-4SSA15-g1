package esprit.tn.irrigationservice.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "irrigation_plans")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IrrigationPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long fieldId;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Double waterQuantity;

    private String description;

    @Enumerated(EnumType.STRING)
    private IrrigationStatus status;

    @ManyToOne
    @JoinColumn(name = "recommendation_id")
    private IrrigationRecommendation recommendation;

    @OneToMany(mappedBy = "irrigationPlan",
            cascade = CascadeType.ALL)
    private List<IrrigationRecord> irrigationRecords;
}
