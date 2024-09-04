package mirkoabozzi.U5S5L3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import mirkoabozzi.U5S5L3.enums.OrderState;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Order {
    private List<Product> productList;
    private Table table;
    private int orderNumber;
    private OrderState orderState;
    private int effectiveSeatNumber;
    private LocalDateTime localDateTime;
    private double coperto;

    public double getTotalOrder() {
        return this.productList.stream().mapToDouble(Product::getPrice).sum() + this.effectiveSeatNumber * coperto;
    }

    public void printOrder() {
        System.out.println("Numero tavolo: " + this.table.getTableNumber());
        System.out.println("Numero ordine: " + this.orderNumber);
        System.out.println("Stato ordine: " + this.orderState);
        System.out.println("Coperti " + this.effectiveSeatNumber);
        System.out.println("Data ordine " + localDateTime);
        System.out.println("Lista prodotti");
        this.productList.forEach(product -> System.out.println(product.descriptions + " Calorie: " + product.calories + " Prezzo: " + product.price + " €"));
        System.out.println("Totale: " + getTotalOrder());
    }
}