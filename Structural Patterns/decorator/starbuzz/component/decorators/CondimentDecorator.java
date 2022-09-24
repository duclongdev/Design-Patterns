package decorator.starbuzz.component.decorators;


import decorator.starbuzz.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public abstract String getDescription();
}
