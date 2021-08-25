import org.junit.Before;
import staff.techStaff.Developer;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer( "Cammy", "345A", 100000);
    }
}
