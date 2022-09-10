import stores.PlasticStore;
import stores.Store;
import stores.WoodStore;

public class Application {
    public static void main(String[] args) {
        Store store = new PlasticStore();
        System.out.println(store.order());
    }
}
