package mirkoabozzi.U5S5L3.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Pizza extends Product {
    private Topping topping;

    public Pizza(String descriptions, int calories, double price, Topping topping) {
        super(descriptions, calories, price);
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "topping=" + topping +
                ", descriptions='" + descriptions + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
