package esprit.tn.irrigationservice.repository;

import esprit.tn.irrigationservice.Domain.IrrigationRecommendation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IIrrigationRecommendationRepository  extends JpaRepository<IrrigationRecommendation, Long> {
}
