package esprit.tn.irrigationservice.repository;

import esprit.tn.irrigationservice.Domain.IrrigationSystem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IrrigationSystemRepository extends JpaRepository<IrrigationSystem, Long> {
}
