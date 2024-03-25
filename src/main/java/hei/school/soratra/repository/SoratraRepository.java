package hei.school.soratra.repository;

import hei.school.soratra.repository.model.Soratra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SoratraRepository extends JpaRepository<Soratra, String> {
    Optional<Soratra> findById(String id);
}
