package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private String orderId;
    private String porductId;
    private String productName;
    private String address;
    private String status;

    public DeliveryReturned(DeliveryMng aggregate){
        super(aggregate);
    }
    public DeliveryReturned(){
        super();
    }
}
