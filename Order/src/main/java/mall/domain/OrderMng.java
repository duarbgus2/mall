package mall.domain;

import mall.domain.OrderPlaced;
import mall.domain.OrderCanceled;
import mall.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="OrderMng_table")
@Data

public class OrderMng  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String productId;
    
    
    
    
    
    private String productName;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String address;

    @PostPersist
    public void onPostPersist(){


        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();



        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();

    }

    public static OrderMngRepository repository(){
        OrderMngRepository orderMngRepository = OrderApplication.applicationContext.getBean(OrderMngRepository.class);
        return orderMngRepository;
    }




    public static void updateStatus(DeliveryStarted deliveryStarted){

        /** Example 1:  new item 
        OrderMng orderMng = new OrderMng();
        repository().save(orderMng);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(orderMng->{
            
            orderMng // do something
            repository().save(orderMng);


         });
        */

        
    }
    public static void updateStatus(DeliveryCompleted deliveryCompleted){

        /** Example 1:  new item 
        OrderMng orderMng = new OrderMng();
        repository().save(orderMng);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCompleted.get???()).ifPresent(orderMng->{
            
            orderMng // do something
            repository().save(orderMng);


         });
        */

        
    }
    public static void updateStatus(DeliveryCanceled deliveryCanceled){

        /** Example 1:  new item 
        OrderMng orderMng = new OrderMng();
        repository().save(orderMng);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCanceled.get???()).ifPresent(orderMng->{
            
            orderMng // do something
            repository().save(orderMng);


         });
        */

        
    }
    public static void updateStatus(DeliveryReturned deliveryReturned){

        /** Example 1:  new item 
        OrderMng orderMng = new OrderMng();
        repository().save(orderMng);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryReturned.get???()).ifPresent(orderMng->{
            
            orderMng // do something
            repository().save(orderMng);


         });
        */

        
    }


}
