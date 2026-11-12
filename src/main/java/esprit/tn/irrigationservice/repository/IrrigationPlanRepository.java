package esprit.tn.irrigationservice.repository;

import esprit.tn.irrigationservice.Domain.IrrigationPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IrrigationPlanRepository extends JpaRepository<IrrigationPlan, Long> {
}
