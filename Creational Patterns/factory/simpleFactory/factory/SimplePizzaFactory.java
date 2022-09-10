package factory;

import pizza.Pizza;
import pizza.typeOfPizza.CheesePizza;
import pizza.typeOfPizza.ClamPizza;
import pizza.typeOfPizza.PepperoniPizza;
import pizza.typeOfPizza.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
