package feature;

import java.util.Date;

public class SimpleDateProvider implements DateProvider {

    public Date UtcNow() {
        return new Date();
    }
}
