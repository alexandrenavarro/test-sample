package com.github.alexandrenavarro.test.add;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.experimental.categories.Category;


/**
 * <p>AdderTest. </p>
 *
 * @author anavarro - May 1, 2016
 *
 */
@Category(AdderConfig.class)
public class AdderTest {

    /**
     * should_return_2_when_add_1_and_1.
     *
     */
    @Test
    public void should_return_2_when_add_1_and_1() {
       assertThat(Adder.add(1.0, 1.0)).isEqualTo(2.0);
    }

}
