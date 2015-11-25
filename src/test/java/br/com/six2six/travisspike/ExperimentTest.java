package br.com.six2six.travisspike;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class ExperimentTest {

    @Test
    public void shouldWorkWithJdk8() {
        Experiment experiment = new Experiment();
        
        LocalDate now = LocalDate.now();
        experiment.setDate(now);
        
        assertEquals(now,  experiment.getDate());
    }
}
