package headfirst.store;

import headfirst.pizza.ChicagoStyleCheesePizza;
import headfirst.pizza.ChicagoStyleClamPizza;
import headfirst.pizza.ChicagoStylePepperoniPizza;
import headfirst.pizza.ChicagoStyleVeggiePizza;
import headfirst.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else
			return null;
	}
}
