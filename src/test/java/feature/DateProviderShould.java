package feature;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateProviderShould {

    @Test
    void return_a_date_object_in_dd_mm_yyyy_format() {
        DateProvider dateProvider = new SimpleDateProvider();
        var result = dateProvider.UtcNow();
        var expected = new SimpleDateFormat("dd/MM/yyyy").format(new Date());

        assertEquals(expected, result);
    }
}
