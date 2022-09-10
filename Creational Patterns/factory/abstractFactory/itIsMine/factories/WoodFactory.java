package factories;

import chairs.Chair;
import chairs.WoodChair;
import tables.Table;
import tables.WoodTable;

public class WoodFactory implements FurnitureAbstractFactory {

    @Override
    public Table createTable() {
        return new WoodTable();
    }

    @Override
    public Chair createChair() {
       return new WoodChair();
    }
    
}
