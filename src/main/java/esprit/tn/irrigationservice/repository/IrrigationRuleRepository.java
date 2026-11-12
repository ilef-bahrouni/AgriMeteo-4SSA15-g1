package esprit.tn.irrigationservice.repository;

import esprit.tn.irrigationservice.Domain.IrrigationRule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IrrigationRuleRepository extends JpaRepository<IrrigationRule, Long> {
}
