package Repository;

import Model.Entity.DebitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitRepository extends JpaRepository<DebitEntity, Long> {
}
