package tr.com.prolms.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ramazancesur on 30/04/2016.
 */
@Transactional
public interface OdevSoruRepo extends JpaRepository<OdevSoruRepo,Long> {
}
