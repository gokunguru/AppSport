package domain.repository;

import domain.model.CoachStudent;
import java.util.List;
import java.util.Optional;

public interface CoachStudentRepository {
    CoachStudent save(CoachStudent link);
    Optional<CoachStudent> findById(Long id);
    List<CoachStudent> findAllByCoachId(Long coachId);
    Optional<CoachStudent> findByCoachIdAndStudentUserId(Long coachId, Long studentUserId);
    void deleteById(Long id);
}
