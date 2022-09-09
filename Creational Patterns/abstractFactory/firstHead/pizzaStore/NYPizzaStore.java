package firstHead.pizzaStore;

import firstHead.factoryIngredientFactory.NYPizzaIngredientFactory;
import firstHead.factoryIngredientFactory.PizzaIngredientFactory;
import firstHead.pizza.CheesePizza;
import firstHead.pizza.ClamPizza;
import firstHead.pizza.PepperoniPizza;
import firstHead.pizza.Pizza;
import firstHead.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");

		}
		return pizza;
	}
}
