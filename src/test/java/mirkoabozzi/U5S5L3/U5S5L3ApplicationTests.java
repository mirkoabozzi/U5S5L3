package mirkoabozzi.U5S5L3;

import mirkoabozzi.U5S5L3.entities.*;
import mirkoabozzi.U5S5L3.enums.OrderState;
import mirkoabozzi.U5S5L3.enums.TableState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class U5S5L3ApplicationTests {
    private Order order;


    @BeforeEach
    public void setUp() {
        System.out.println("Set Up before all");
        Topping topping = new Topping("Patatine");
        Topping topping1 = new Topping("Prosciutto");
        Pizza pizza = new Pizza("Patatine", 500, 6.5, topping);
        Pizza pizza1 = new Pizza("Prosciutto", 500, 6.50, topping1);
        Table table1 = new Table(TableState.LIBERO, 1, 4);
        List<Product> productList = new ArrayList<>();
        productList.add(pizza);
        productList.add(pizza1);
        order = new Order(productList, table1, 1, OrderState.IN_CORSO, 2, LocalDateTime.now(), 3);
        System.out.println(order);
    }

    @Test
    void testGetTotalOrder() {
        double total = order.getTotalOrder();
        assertEquals(19, total);
    }

}
