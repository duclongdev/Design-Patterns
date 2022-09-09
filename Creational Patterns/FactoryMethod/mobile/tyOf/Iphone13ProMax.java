package mobile.tyOf;

import java.math.BigDecimal;
import java.sql.Date;

import mobile.Mobile;

public class Iphone13ProMax extends Mobile {
    public Iphone13ProMax() {
        name = "Iphone 13 Pro Max";
        price = new BigDecimal(1000);
        timeProduction = new Date(2020 - 17 - 03);
    }

}
