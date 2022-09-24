package decorator.mine.component;

public class HNPizza extends Pizza {
    public HNPizza(){
        this.name = "Ha Noi Pizza";
    }

    @Override
    public double cost() {
        return 1.4;
    }
    
}
