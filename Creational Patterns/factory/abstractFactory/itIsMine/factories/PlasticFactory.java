package factories;

import chairs.Chair;
import chairs.PlasticChair;
import tables.PlasticTable;
import tables.Table;


public class PlasticFactory implements FurnitureAbstractFactory {

    @Override
    public Table createTable() {
        return new PlasticTable();
    }

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }
    
}
