package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }
//    @Test
//    public void testJobConstructorSetsAllFields(){
//        new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        assertEquals(Job.getId(), 1);
//        assertEquals(Job.getName(), "Product tester");
//        assertEquals(Job.getEmployer().toString(), "ACME");
//        assertEquals(Job.getLocation().toString(), "Desert");
//        assertEquals(Job.getPositionType().toString(), "Quality control");
//        assertEquals(Job.getCoreCompetency().toString(), "Persistence");
//        assertTrue(Job.getEmployer() instanceof Employer);
//        assertTrue(Job.getLocation() instanceof Location);
//        assertTrue(Job.getPositionType() instanceof PositionType);
//        assertTrue(Job.getCoreCompetency() instanceof CoreCompetency);
//        assertTrue(Job.getCoreCompetency() != null);
//
//    }


}
