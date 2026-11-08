package esprit.tn.irrigationservice.repository;

import esprit.tn.irrigationservice.Domain.IrrigationSystem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IIrrigationSystemRepository extends JpaRepository<IrrigationSystem, Long> {
}
