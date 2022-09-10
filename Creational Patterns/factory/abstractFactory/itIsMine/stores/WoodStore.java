package stores;

import chairs.Chair;
import factories.FurnitureAbstractFactory;
import factories.WoodFactory;
import tables.Table;

public class WoodStore extends Store {

    FurnitureAbstractFactory factory = new WoodFactory();

    @Override
    public Table createTable() {
        return factory.createTable();
    }

    @Override
    Chair createChair() {
        return factory.createChair();
    }

}
