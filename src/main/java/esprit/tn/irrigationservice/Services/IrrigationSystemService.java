package esprit.tn.irrigationservice.Services;

import esprit.tn.irrigationservice.Domain.IrrigationSystem;

import java.util.List;
import java.util.Optional;

public interface IrrigationSystemService {
    IrrigationSystem add(IrrigationSystem entity);
    List<IrrigationSystem> getAll();
    Optional<IrrigationSystem> getById(Long id);
    IrrigationSystem update(Long id, IrrigationSystem entity);
    void delete(Long id);
}
