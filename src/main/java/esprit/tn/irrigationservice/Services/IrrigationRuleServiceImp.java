package esprit.tn.irrigationservice.Services;

import esprit.tn.irrigationservice.Domain.IrrigationRule;
import esprit.tn.irrigationservice.repository.IrrigationRuleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class IrrigationRuleServiceImp implements IrrigationRuleService {
    private final IrrigationRuleRepository repository;

    public IrrigationRuleServiceImp(IrrigationRuleRepository repository) {
        this.repository = repository;
    }

    public IrrigationRule save(IrrigationRule entity) {
        return repository.save(entity);
    }

    public List<IrrigationRule> findAll() {
        return repository.findAll();
    }

    public Optional<IrrigationRule> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public IrrigationRule add(IrrigationRule entity) {
        return null;
    }

    @Override
    public List<IrrigationRule> getAll() {
        return List.of();
    }

    @Override
    public Optional<IrrigationRule> getById(Long id) {
        return Optional.empty();
    }

    public IrrigationRule update(Long id, IrrigationRule entity) {
        IrrigationRule existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Rule not found"));

        existing.setName(entity.getName());
        existing.setDescription(entity.getDescription());
        existing.setTemperatureThreshold(entity.getTemperatureThreshold());
        existing.setHumidityThreshold(entity.getHumidityThreshold());
        existing.setSoilMoistureThreshold(entity.getSoilMoistureThreshold());
        existing.setActive(entity.getActive());

        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {

    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
