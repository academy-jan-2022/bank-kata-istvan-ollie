package feature;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateProviderShould {

    @Test
    void return_a_date_object(){
        DateProvider dateProvider = new SimpleDateProvider();
        var result = dateProvider.UtcNow();
        assertThat(result, instanceOf(Date.class));
    }

    @Test
    void return_a_date_object_in_dd_mm_yyyy_format() {
        DateProvider dateProvider = new SimpleDateProvider();
        var result = dateProvider.UtcNow();
        var expected = new SimpleDateFormat("dd/mm/yyyy").format(new Date());

        assertEquals(expected, result);
    }
}
