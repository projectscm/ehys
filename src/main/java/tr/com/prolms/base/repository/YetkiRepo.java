package tr.com.prolms.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.com.prolms.base.entity.Yetkiler;

/**
 * Created by ramazancesur on 30/04/2016.
 */

public interface YetkiRepo extends JpaRepository<Yetkiler,Long> {
}
