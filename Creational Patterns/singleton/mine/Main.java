package mine;
public class Main{
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.display();
        Singleton singleton2 = Singleton.getInstance();
        singleton2.display();
    }
}