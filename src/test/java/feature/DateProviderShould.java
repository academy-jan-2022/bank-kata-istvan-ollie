package feature;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class DateProviderShould {

    @Test
    void return_a_date_object(){
        DateProvider dateProvider = new SimpleDateProvider();
        var result = dateProvider.UtcNow();
        assertThat(result, instanceOf(Date.class));
    }
}
