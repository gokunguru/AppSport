package domain.repository;

import domain.model.Set;
import java.util.List;
import java.util.Optional;

public interface SetRepository {
    Set save(Set set);
    Optional<Set> findById(Long id);
    List<Set> findAllBySessionId(Long sessionId);
    void deleteById(Long id);
}
