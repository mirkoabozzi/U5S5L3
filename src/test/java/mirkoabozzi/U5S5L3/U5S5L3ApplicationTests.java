package mirkoabozzi.U5S5L3;

import mirkoabozzi.U5S5L3.entities.*;
import mirkoabozzi.U5S5L3.enums.OrderState;
import mirkoabozzi.U5S5L3.enums.TableState;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class U5S5L3ApplicationTests {
    private List<Product> productList = new ArrayList<>();
    private Order order;

    @AfterEach
    public void cleanProductList() {
        System.out.println("After each");
        productList.clear();
        System.out.println(productList);
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Set Up before each");
        Topping topping = new Topping("Patatine");
        Topping topping1 = new Topping("Prosciutto");
        Pizza pizza = new Pizza("Patatine", 500, 6.5, topping);
        Pizza pizza1 = new Pizza("Prosciutto", 500, 6.50, topping1);
        Table table1 = new Table(TableState.LIBERO, 1, 4);
        productList.add(pizza);
        productList.add(pizza1);
        order = new Order(productList, table1, 1, OrderState.IN_CORSO, 2, LocalDateTime.now(), 3);
        System.out.println(order);
    }

    @Test
    public void testGetTotalOrder() {
        double total = order.getTotalOrder();
        System.out.println(total);
        assertEquals(19, total);
    }

    @ParameterizedTest
    @CsvSource({"19"})
    public void testGetTotalOrderParametrized(double expectedTotal) {
        double total = order.getTotalOrder();
        System.out.println(total);
        assertEquals(expectedTotal, total);
    }
}
