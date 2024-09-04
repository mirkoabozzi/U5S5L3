package mirkoabozzi.U5S5L3.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Topping {
    private String tomato;
    private String cheese;
    private String ingredients;

    public Topping(String ingredients) {
        this.tomato = "tomato";
        this.cheese = "cheese";
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "tomato='" + tomato + '\'' +
                ", cheese='" + cheese + '\'' +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }
}
