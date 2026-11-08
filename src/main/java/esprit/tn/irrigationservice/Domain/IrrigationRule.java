package esprit.tn.irrigationservice.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


    @Entity
    @Table(name = "irrigation_rules")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public class IrrigationRule {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        private String description;

        private Double temperatureThreshold;

        private Double humidityThreshold;

        private Double soilMoistureThreshold;

        private Boolean active;

        @OneToMany(mappedBy = "irrigationRule",
                cascade = CascadeType.ALL)
        private List<IrrigationRecommendation> recommendations;
    }

