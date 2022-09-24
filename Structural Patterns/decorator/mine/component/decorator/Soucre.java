package decorator.mine.component.decorator;

import decorator.mine.component.Pizza;

public class Soucre extends PIzzaDecorator {
    Pizza pizza;
    public Soucre(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getName() {
        return pizza.getName() + ", with Source";
    }

    @Override
    public double cost() {
        return  pizza.cost() + 0.3;
    }
    
}
