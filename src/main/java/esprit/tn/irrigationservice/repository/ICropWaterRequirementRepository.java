package esprit.tn.irrigationservice.repository;

import esprit.tn.irrigationservice.Domain.CropWaterRequirement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICropWaterRequirementRepository extends JpaRepository<CropWaterRequirement, Long> {
}
