package stores;

import chairs.Chair;
import factories.FurnitureAbstractFactory;
import factories.PlasticFactory;
import tables.Table;

public class PlasticStore extends Store {
    FurnitureAbstractFactory factory = new PlasticFactory();
    @Override
    public Table createTable() {
        return factory.createTable(); 
    }

    @Override
    Chair createChair() {
        return factory.createChair();
    }

}
