package com.parmentier;

import com.parmentier.model.FIDog;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FIDogTest {

    @Test
    public void testWAFWAF(){
        FIDog dog = (b) -> b.toUpperCase();
        Assertions.assertThat(dog.bark("WafWaf")).isEqualTo("WAFWAF");
    }

}
