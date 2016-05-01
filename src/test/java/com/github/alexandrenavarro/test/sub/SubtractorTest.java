package com.github.alexandrenavarro.test.sub;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.github.alexandrenavarro.test.add.AdderConfig;

/**
 * <p>SubtractorTest. </p>
 *
 * @author anavarro - May 1, 2016
 *
 */

@Category(SubConfig.class)
public class SubtractorTest {

    
    /**
     * should_return_1_when_2_sub_1.
     *
     * @throws Exception
     */
    @Test
    public void should_return_1_when_2_sub_1() {
        assertThat(Substractor.sub(2.0, 1.0)).isEqualTo(1.0);
    }
    
}
