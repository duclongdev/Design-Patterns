package itIsMine.store.storeDetail;

import itIsMine.mobile.Mobile;
import itIsMine.mobile.tyOf.XiaomiK20;
import itIsMine.store.Store;

public class AndStore extends Store {
    @Override
    public Mobile getMobile(String name) {
        if (name.equals("Xiaomi K20"))
            return new XiaomiK20();
        return null;
    }

}
