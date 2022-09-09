package firstHead.factoryIngredientFactory;

import firstHead.ingredient.cheese.Cheese;
import firstHead.ingredient.cheese.MozzarellaCheese;
import firstHead.ingredient.clams.Clams;
import firstHead.ingredient.clams.FrozenClams;
import firstHead.ingredient.dough.Dough;
import firstHead.ingredient.dough.ThickCrustDough;
import firstHead.ingredient.pepperoni.Pepperoni;
import firstHead.ingredient.pepperoni.SlicedPepperoni;
import firstHead.ingredient.sauce.PlumTomatoSauce;
import firstHead.ingredient.sauce.Sauce;
import firstHead.ingredient.veggies.BlackOlives;
import firstHead.ingredient.veggies.Eggplant;
import firstHead.ingredient.veggies.Spinach;
import firstHead.ingredient.veggies.Veggies;

public class ChicagoPizzaIngredientFactory
		implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(),
				new Spinach(),
				new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
