import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Alex", "111A", 150000, "IT", 500000);
    }

    @Test
    public void hasName(){
        assertEquals("Alex", director.getName());
    }

    @Test
    public void hasNIN(){
        assertEquals("111A", director.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(150000.00, director.getSalary(), 0);
    }

    @Test
    public void hasBudget(){
        assertEquals(500000, director.getBudget(),0);
    }

    @Test
    public void canCalculateBonus() {
        assertEquals(3000, director.payBonus(), 0);
    }


}
