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
    @Test
    public void testJobConstructorSetsAllFields(){
        Job someJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(someJob.getId(), 1);
        assertEquals(someJob.getName(), "Product tester");
        assertEquals(someJob.getEmployer().toString(), "ACME");
        assertEquals(someJob.getLocation().toString(), "Desert");
        assertEquals(someJob.getPositionType().toString(), "Quality control");
        assertEquals(someJob.getCoreCompetency().toString(), "Persistence");
        assertTrue(someJob.getEmployer() instanceof Employer);
        assertTrue(someJob.getLocation() instanceof Location);
        assertTrue(someJob.getPositionType() instanceof PositionType);
        assertTrue(someJob.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(someJob.getCoreCompetency() != null);

    }
    @Test
    public void testJobsForEquality(){
        Job someJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job anotherJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(someJob.equals(anotherJob));
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char firstChar = job.toString().charAt(0);
        char lastChar = job.toString().charAt(job.toString().length()-1);
        assertEquals(firstChar, '\n');
        assertEquals(lastChar, '\n');
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = job.toString();
        assertEquals(jobString, job.toString());
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job job = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
        String emptyString = job.toString();
        assertEquals(emptyString, job.toString());
    }


}
