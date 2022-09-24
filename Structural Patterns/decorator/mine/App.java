package decorator.mine;

import decorator.mine.component.HCMPizza;
import decorator.mine.component.Pizza;
import decorator.mine.component.decorator.Carrot;
import decorator.mine.component.decorator.Soucre;

public class App {
    public static void main(String[] args) {
        Pizza pizza = new HCMPizza();
        System.out.println(pizza.getName() + ", Cost: " + pizza.cost());
        Pizza cPizza = new Carrot(pizza);
        System.out.println(cPizza.getName() + ", Cost: " + cPizza.cost());
        Pizza cPizza2 = new Soucre(cPizza);
        System.out.println(cPizza2.getName() + ", Cost: " + cPizza2.cost());

    }
    
}
