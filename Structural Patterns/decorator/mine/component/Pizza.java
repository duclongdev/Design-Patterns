package decorator.mine.component;

public abstract class Pizza {
    String name;
    public String getName(){
        return name;
    }
    public abstract double cost();
}
