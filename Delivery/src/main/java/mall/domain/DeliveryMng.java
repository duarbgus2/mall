package mall.domain;

import mall.domain.DeliveryStarted;
import mall.domain.DeliveryCanceled;
import mall.domain.DeliveryCompleted;
import mall.domain.DeliveryReturned;
import mall.DeliveryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="DeliveryMng_table")
@Data

public class DeliveryMng  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String porductId;
    
    
    
    
    
    private String productName;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){


        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();



        DeliveryCanceled deliveryCanceled = new DeliveryCanceled(this);
        deliveryCanceled.publishAfterCommit();



        DeliveryCompleted deliveryCompleted = new DeliveryCompleted(this);
        deliveryCompleted.publishAfterCommit();



        DeliveryReturned deliveryReturned = new DeliveryReturned(this);
        deliveryReturned.publishAfterCommit();

    }

    public static DeliveryMngRepository repository(){
        DeliveryMngRepository deliveryMngRepository = DeliveryApplication.applicationContext.getBean(DeliveryMngRepository.class);
        return deliveryMngRepository;
    }




    public static void deliveryStart(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        DeliveryMng deliveryMng = new DeliveryMng();
        repository().save(deliveryMng);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(deliveryMng->{
            
            deliveryMng // do something
            repository().save(deliveryMng);


         });
        */

        
    }
    public static void deliveryCancel(OrderCanceled orderCanceled){

        /** Example 1:  new item 
        DeliveryMng deliveryMng = new DeliveryMng();
        repository().save(deliveryMng);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(deliveryMng->{
            
            deliveryMng // do something
            repository().save(deliveryMng);


         });
        */

        
    }


}
