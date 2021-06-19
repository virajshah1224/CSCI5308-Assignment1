import  org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CityTest {

    @Test
    public void constructorTest()
    {
        City c = new City("Hello");
        assertEquals("Hello",c.name);
    }



}
