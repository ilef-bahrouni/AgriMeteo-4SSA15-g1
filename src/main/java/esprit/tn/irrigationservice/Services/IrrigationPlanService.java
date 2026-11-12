package esprit.tn.irrigationservice.Services;

import esprit.tn.irrigationservice.Domain.IrrigationPlan;

import java.util.List;
import java.util.Optional;

public interface IrrigationPlanService {
    IrrigationPlan add(IrrigationPlan entity);
    List<IrrigationPlan> getAll();
    Optional<IrrigationPlan> getById(Long id);
    IrrigationPlan update(Long id, IrrigationPlan entity);
    void delete(Long id);
}
