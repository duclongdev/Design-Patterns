package firstHead.factoryIngredientFactory;

import firstHead.ingredient.cheese.Cheese;
import firstHead.ingredient.cheese.ReggianoCheese;
import firstHead.ingredient.clams.Clams;
import firstHead.ingredient.clams.FreshClams;
import firstHead.ingredient.dough.Dough;
import firstHead.ingredient.dough.ThinCrustDough;
import firstHead.ingredient.pepperoni.Pepperoni;
import firstHead.ingredient.pepperoni.SlicedPepperoni;
import firstHead.ingredient.sauce.MarinaraSauce;
import firstHead.ingredient.sauce.Sauce;
import firstHead.ingredient.veggies.Garlic;
import firstHead.ingredient.veggies.Mushroom;
import firstHead.ingredient.veggies.Onion;
import firstHead.ingredient.veggies.RedPepper;
import firstHead.ingredient.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
