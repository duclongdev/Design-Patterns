package itIsMine.store.storeDetail;

import itIsMine.mobile.Mobile;
import itIsMine.mobile.tyOf.Iphone13ProMax;
import itIsMine.mobile.tyOf.Iphone14;
import itIsMine.store.Store;

public class IosStore extends Store {
    String name;

    @Override
    public Mobile getMobile(String name) {
        if (name == "iphone14")
            return new Iphone14();
        else if (name == "Iphone 13 Pro Max")
            return new Iphone13ProMax();
        return null;
    }

}
