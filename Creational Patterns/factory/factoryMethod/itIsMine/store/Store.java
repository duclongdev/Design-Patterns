package itIsMine.store;

import itIsMine.mobile.Mobile;

public abstract class Store {
    public abstract Mobile getMobile(String name);

    public void showBill(String name) {
        Mobile mobile = getMobile(name);
        System.out.println(mobile.toString());
    }
}
