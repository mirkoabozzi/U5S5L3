package mirkoabozzi.U5S5L3.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class Menu {
    private List<Pizza> pizzaList;
    private List<Topping> toppingList;
    private List<Drink> drinkList;

    public Menu(List<Pizza> pizzaList, List<Topping> toppingList, List<Drink> drinkList) {
        this.pizzaList = pizzaList;
        this.toppingList = toppingList;
        this.drinkList = drinkList;
    }

    public void printMenu() {
        System.out.println("Pizze");
        pizzaList.forEach(pizza -> System.out.println(pizza.descriptions + " Calorie: " + pizza.calories + " Prezzo: " + pizza.price + " €"));
        System.out.println("Topping");
        toppingList.forEach(topping -> System.out.println("Topping: " + topping.getIngredients()));
        System.out.println("Drink");
        drinkList.forEach(drink -> System.out.println(drink.descriptions + " Calorie: " + drink.calories + " Prezzo: " + drink.price + " €"));
    }
}
