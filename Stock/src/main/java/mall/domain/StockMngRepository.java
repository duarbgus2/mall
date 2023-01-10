package mall.domain;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="stockMngs", path="stockMngs")
public interface StockMngRepository extends PagingAndSortingRepository<StockMng, Long>{

}
