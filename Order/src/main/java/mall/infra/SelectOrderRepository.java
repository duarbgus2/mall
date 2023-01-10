package mall.infra;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="selectOrders", path="selectOrders")
public interface SelectOrderRepository extends PagingAndSortingRepository<SelectOrder, Long> {

    

    
}
