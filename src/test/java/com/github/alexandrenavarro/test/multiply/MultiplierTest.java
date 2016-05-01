package com.github.alexandrenavarro.test.multiply;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>MultiplierTest. </p>
 *
 * @author anavarro - May 1, 2016
 *
 */
@Category(MultiplyConfig.class)
public class MultiplierTest {

    /**
     * should_return_4_when_2_times_2.
     *
     */
    @Test
    public void should_return_4_when_2_times_2() {
        assertThat(Multiplier.multiply(2.0, 2.0)).isEqualTo(4.0);
    }

}
