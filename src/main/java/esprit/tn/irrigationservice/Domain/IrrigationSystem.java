package esprit.tn.irrigationservice.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "irrigation_systems")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IrrigationSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long fieldId;

    private String systemName;

    @Enumerated(EnumType.STRING)
    private IrrigationMethod irrigationMethod;

    private BigDecimal capacity;

    private Double efficiency;

    @Enumerated(EnumType.STRING)
    private SystemStatus status;

    private LocalDate installationDate;
}
