package esprit.tn.irrigationservice.Services;

import java.util.List;
import java.util.Optional;

public interface CropWaterRequirement {
    CropWaterRequirement add(CropWaterRequirement entity);
    List<CropWaterRequirement> getAll();
    Optional<CropWaterRequirement> getById(Long id);
    CropWaterRequirement update(Long id, CropWaterRequirement entity);
    void delete(Long id);
}
