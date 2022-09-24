package decorator.mine.component.decorator;

import decorator.mine.component.Pizza;

public class Carrot extends PIzzaDecorator {
    Pizza pizza;
    public Carrot(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getName() {
        return pizza.getName() + ", with Carrot";
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.6;
    }
    
}
