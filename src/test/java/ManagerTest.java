import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("John","245B", 10000.00,"IT");
    }

    @Test
    public void hasName(){
        assertEquals("John", manager.getName());
    }

    @Test
    public void hasNIN(){
        assertEquals("245B", manager.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(10000.00, manager.getSalary(), 0);
    }

    @Test
    public void hasDepartment(){
        assertEquals("IT",manager.getDeptName());
    }

    @Test
    public void canIncreaseSalary(){
        manager.raiseSalary(1000);
        assertEquals(11000, manager.getSalary(),0);
    }

    @Test
    public void canCalculateBonus() {
        assertEquals(100, manager.payBonus(), 0);
    }
}
