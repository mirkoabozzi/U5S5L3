package mirkoabozzi.U5S5L3.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Drink extends Product {
    private double quantity;

    public Drink(String descriptions, int calories, double price, double quantity) {
        super(descriptions, calories, price);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "descriptions='" + descriptions + '\'' +
                ", calories=" + calories +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
