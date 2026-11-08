package esprit.tn.irrigationservice.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "crop_water_requirements")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CropWaterRequirement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cropType;

    private String growthStage;

    private BigDecimal waterRequirementPerDay;

    private Double optimalTemperature;

    private Double optimalHumidity;

    private String description;
}
