package kim.jiho.entertainment.repository;

import kim.jiho.entertainment.domain.Agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgencyRepository extends JpaRepository<Agency, Long> {}
