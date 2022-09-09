import store.Store;
import store.storeDetail.AndStore;
import store.storeDetail.IosStore;

public class Application {
    private static Store store;

    public static void main(String[] args) {
        store = new IosStore();
        String name = "Iphone 13 Pro Max";
        store.showBill(name);
    }

}
