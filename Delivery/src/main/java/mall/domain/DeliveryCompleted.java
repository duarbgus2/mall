package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String porductId;
    private String productName;
    private String address;
    private String status;

    public DeliveryCompleted(DeliveryMng aggregate){
        super(aggregate);
    }
    public DeliveryCompleted(){
        super();
    }
}
