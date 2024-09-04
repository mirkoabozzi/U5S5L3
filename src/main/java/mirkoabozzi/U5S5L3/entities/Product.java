package mirkoabozzi.U5S5L3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Product {
    protected String descriptions;
    protected int calories;
    protected double price;
}
