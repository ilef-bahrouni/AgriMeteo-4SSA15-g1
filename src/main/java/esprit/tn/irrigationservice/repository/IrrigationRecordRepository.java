package esprit.tn.irrigationservice.repository;

import esprit.tn.irrigationservice.Domain.IrrigationRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IrrigationRecordRepository extends JpaRepository<IrrigationRecord, Long> {
}
