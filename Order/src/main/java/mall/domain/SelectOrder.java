package mall.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="SelectOrder_table")
@Data
public class SelectOrder {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}
