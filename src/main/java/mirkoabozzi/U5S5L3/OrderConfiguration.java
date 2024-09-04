package mirkoabozzi.U5S5L3;

import mirkoabozzi.U5S5L3.entities.Order;
import mirkoabozzi.U5S5L3.entities.Product;
import mirkoabozzi.U5S5L3.entities.Table;
import mirkoabozzi.U5S5L3.enums.OrderState;
import mirkoabozzi.U5S5L3.enums.TableState;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDateTime;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class OrderConfiguration {

    @Bean
    public Table getTable1() {
        return new Table(TableState.LIBERO, 1, 4);
    }

    @Bean
    public Table getTable2() {
        return new Table(TableState.LIBERO, 2, 6);
    }

    @Bean
    public Table getTable3() {
        return new Table(TableState.LIBERO, 3, 10);
    }

    @Bean
    public Order getOrder(@Qualifier("getBeer") Product product1, @Qualifier("getPizzaPatatine") Product product2, @Qualifier("getTable1") Table table, @Value("${coperto.costoCoperto}") double coperto) {
        return new Order(List.of(product1, product2), table, 1, OrderState.IN_CORSO, 2, LocalDateTime.of(2024, 9, 3, 15, 0, 0), coperto);
    }

}
