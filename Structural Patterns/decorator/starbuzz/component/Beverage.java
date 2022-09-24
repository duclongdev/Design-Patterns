package decorator.starbuzz.component;

import decorator.starbuzzWithSizes.component.Beverage.Size;

public abstract class Beverage {
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();

    public Size getSize() {
        return null;
    }
}
