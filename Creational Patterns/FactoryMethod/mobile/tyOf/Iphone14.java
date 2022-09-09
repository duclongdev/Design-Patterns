package mobile.tyOf;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.Year;

import mobile.Mobile;

public class Iphone14 extends Mobile {
    public Iphone14() {
        name = "Iphone 14";
        price = new BigDecimal(1999);
        timeProduction = new Date(2002 - 16 - 07);
    }
}
