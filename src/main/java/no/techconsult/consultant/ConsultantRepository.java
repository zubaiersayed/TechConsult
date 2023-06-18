package no.techconsult.consultant;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface ConsultantRepository extends JpaRepository<Consultant, Long> {

}
