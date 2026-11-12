package esprit.tn.irrigationservice.Services;

import esprit.tn.irrigationservice.Domain.IrrigationRecommendation;

import java.util.List;
import java.util.Optional;

public interface IrrigationRecommendationService {
    IrrigationRecommendation add(IrrigationRecommendation entity);
    List<IrrigationRecommendation> getAll();
    Optional<IrrigationRecommendation> getById(Long id);
    IrrigationRecommendation update(Long id, IrrigationRecommendation entity);
    void delete(Long id);
}
