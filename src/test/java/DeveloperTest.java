import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer( "Cammy", "345A", 100000);
    }
    @Test
    public void hasName(){
        assertEquals("Cammy", developer.getName());
    }

    @Test
    public void hasNIN(){
        assertEquals("345A", developer.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000.00, developer.getSalary(), 0);
    }

}
