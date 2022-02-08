package feature;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateProvider implements DateProvider {

    public String UtcNow() {
        return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    }
}
