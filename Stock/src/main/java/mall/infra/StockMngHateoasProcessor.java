package mall.infra;
import mall.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class StockMngHateoasProcessor implements RepresentationModelProcessor<EntityModel<StockMng>>  {

    @Override
    public EntityModel<StockMng> process(EntityModel<StockMng> model) {

        
        return model;
    }
    
}
