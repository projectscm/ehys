package tr.com.prolms.base.repository;

import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import tr.com.prolms.base.entity.Anketler;

/**
 * Created by ramazancesur on 30/04/2016.
 */
@Transactional
public interface AnketRepo extends JpaRepository<Anketler,Long>  {


}
