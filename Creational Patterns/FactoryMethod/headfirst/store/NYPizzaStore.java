package headfirst.store;

import headfirst.pizza.NYStyleCheesePizza;
import headfirst.pizza.NYStyleClamPizza;
import headfirst.pizza.NYStylePepperoniPizza;
import headfirst.pizza.NYStyleVeggiePizza;
import headfirst.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else
			return null;
	}
}
