package stores;

import chairs.Chair;
import tables.Table;

public abstract class Store {
    abstract Table createTable();
    abstract Chair createChair();
    public String order(){
        Table table = createTable();
        Chair chair = createChair();
        return String.format("%s, %s", table.getName(), chair.getName());
    }
}
