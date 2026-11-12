package esprit.tn.irrigationservice.Services;

import esprit.tn.irrigationservice.Domain.IrrigationRecord;

import java.util.List;
import java.util.Optional;

public interface IrrigationRecordService {
    IrrigationRecord add(IrrigationRecord entity);
    List<IrrigationRecord> getAll();
    Optional<IrrigationRecord> getById(Long id);
    IrrigationRecord update(Long id, IrrigationRecord entity);
    void delete(Long id);
}
