package mine;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){};
    public static Singleton getInstance(){
        if(singleton == null)
            singleton = new Singleton();
        return singleton;
    }
    public void display(){
        System.out.println(singleton);
    }
}
