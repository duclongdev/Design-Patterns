package itIsMine.mobile;

import java.math.BigDecimal;
import java.sql.Date;

public abstract class Mobile {
    protected String name;
    protected BigDecimal price;
    protected Date timeProduction;

    @Override
    public String toString() {
        return "Mobile [name=" + name + ", price=" + price + ", timeProduction=" + timeProduction + "]";
    }
}
