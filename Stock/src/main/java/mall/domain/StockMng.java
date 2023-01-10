package mall.domain;

import mall.domain.StockDecreased;
import mall.domain.StockIncreased;
import mall.StockApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="StockMng_table")
@Data

public class StockMng  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String productName;
    
    
    
    
    
    private String productImage;
    
    
    
    
    
    private Integer stock;

    @PostPersist
    public void onPostPersist(){


        StockDecreased stockDecreased = new StockDecreased(this);
        stockDecreased.publishAfterCommit();



        StockIncreased stockIncreased = new StockIncreased(this);
        stockIncreased.publishAfterCommit();

    }

    public static StockMngRepository repository(){
        StockMngRepository stockMngRepository = StockApplication.applicationContext.getBean(StockMngRepository.class);
        return stockMngRepository;
    }




    public static void stockDecrease(DeliveryStarted deliveryStarted){

        /** Example 1:  new item 
        StockMng stockMng = new StockMng();
        repository().save(stockMng);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(stockMng->{
            
            stockMng // do something
            repository().save(stockMng);


         });
        */

        
    }
    public static void stockIncrease(DeliveryCanceled deliveryCanceled){

        /** Example 1:  new item 
        StockMng stockMng = new StockMng();
        repository().save(stockMng);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCanceled.get???()).ifPresent(stockMng->{
            
            stockMng // do something
            repository().save(stockMng);


         });
        */

        
    }


}
