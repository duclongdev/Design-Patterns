package mobile.tyOf;

import java.math.BigDecimal;
import java.sql.Date;

import mobile.Mobile;

public class XiaomiK20 extends Mobile {
    public XiaomiK20() {
        name = "Xiaomi K20";
        price = new BigDecimal(200);
        timeProduction = new Date(2019 - 30 - 12);
    }
}
