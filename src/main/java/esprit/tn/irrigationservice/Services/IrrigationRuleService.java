package esprit.tn.irrigationservice.Services;

import esprit.tn.irrigationservice.Domain.IrrigationRule;

import java.util.List;
import java.util.Optional;


public interface IrrigationRuleService {
    IrrigationRule add(IrrigationRule entity);
    List<IrrigationRule> getAll();
    Optional<IrrigationRule> getById(Long id);
    IrrigationRule update(Long id, IrrigationRule entity);
    void delete(Long id);
}
