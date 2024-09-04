package mirkoabozzi.U5S5L3;

import mirkoabozzi.U5S5L3.entities.Drink;
import mirkoabozzi.U5S5L3.entities.Menu;
import mirkoabozzi.U5S5L3.entities.Pizza;
import mirkoabozzi.U5S5L3.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MenuConfiguration {

    @Bean
    public Topping getToppingProsciutto() {
        return new Topping("prosciutto");
    }

    @Bean
    public Topping getToppingPatatine() {
        return new Topping("patatine");
    }

    @Bean
    public Pizza getPizzaProsciutto() {
        return new Pizza("Pizza Prosciutto", 500, 8.00, getToppingProsciutto());
    }


    @Bean
    public Pizza getPizzaPatatine() {
        return new Pizza("Pizza Patatine", 600, 9.00, getToppingPatatine());
    }

    @Bean
    public Drink getDrinkCocaCola() {
        return new Drink("Coca Cola", 20, 1.00, 0.33);
    }

    @Bean
    public Drink getBeer() {
        return new Drink("Ichnusa", 80, 1, 0.33);
    }

    @Bean
    public Menu getMenu() {
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(getPizzaPatatine());
        pizzas.add(getPizzaProsciutto());

        List<Drink> drinks = new ArrayList<>();
        drinks.add(getBeer());
        drinks.add(getDrinkCocaCola());

        List<Topping> toppings = new ArrayList<>();
        toppings.add(getToppingPatatine());
        toppings.add(getToppingProsciutto());

        return new Menu(pizzas, toppings, drinks);
    }

}
