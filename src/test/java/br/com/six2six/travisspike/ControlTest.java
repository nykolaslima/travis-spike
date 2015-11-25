package br.com.six2six.travisspike;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ControlTest {

    @Test
    public void shouldBeOk() {
        Control control = new Control();
        control.setOk(true);
        
        assertTrue(control.isOk());
    }
}
