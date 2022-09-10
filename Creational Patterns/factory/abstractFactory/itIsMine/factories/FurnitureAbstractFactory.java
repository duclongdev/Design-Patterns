package factories;

import chairs.Chair;
import tables.Table;

public interface FurnitureAbstractFactory {
    Table createTable();
    Chair createChair();
}
