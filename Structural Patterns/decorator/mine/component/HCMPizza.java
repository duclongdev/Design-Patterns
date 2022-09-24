package decorator.mine.component;

public class HCMPizza extends Pizza {

    public HCMPizza(){
        this.name = "HCM Pizza";
    }
    @Override
    public double cost() {
        return 1.6;
    }
    
}
