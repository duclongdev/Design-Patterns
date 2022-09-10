package firstHead.factoryIngredientFactory;

import firstHead.ingredient.cheese.Cheese;
import firstHead.ingredient.clams.Clams;
import firstHead.ingredient.dough.*;
import firstHead.ingredient.pepperoni.Pepperoni;
import firstHead.ingredient.sauce.Sauce;
import firstHead.ingredient.veggies.*;

public interface PizzaIngredientFactory {

	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClam();

}
