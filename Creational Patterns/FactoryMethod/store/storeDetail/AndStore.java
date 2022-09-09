package store.storeDetail;

import mobile.Mobile;
import mobile.tyOf.XiaomiK20;
import store.Store;

public class AndStore extends Store {
    @Override
    public Mobile getMobile(String name) {
        if (name.equals("Xiaomi K20"))
            return new XiaomiK20();
        return null;
    }

}
