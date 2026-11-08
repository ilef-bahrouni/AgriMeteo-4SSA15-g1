package esprit.tn.irrigationservice.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "irrigation_recommendations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IrrigationRecommendation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private Double recommendedWaterQuantity;

    private LocalDateTime recommendationDate;

    @Enumerated(EnumType.STRING)
    private RecommendationStatus status;

    @ManyToOne
    @JoinColumn(name = "irrigation_rule_id")
    private IrrigationRule irrigationRule;

    @OneToMany(mappedBy = "recommendation",
            cascade = CascadeType.ALL)
    private List<IrrigationPlan> irrigationPlans;
}

