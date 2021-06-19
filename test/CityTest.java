import  org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CityTest {

    @Test
    public void constructorTest()
    {
        City c = new City("Hello");
        assertEquals("Hello",c.name);
    }

    @Test
    public void constructorDistanceTest()
    {
        City c = new City(4);
        assertEquals(4,c.distance);
    }
    @Test
    public void addLinkTest()
    {
        City c1 = new City("Halifax");
        City c2 = new City("Toronto");
        Link l = new Link(c1,c2,3);
        City c = new City(2);
        c.addLink(l);
        assertTrue(c.cities.size()>0,"False");
    }

    @Test
    public void testCompareToSmaller()
    {
        City c1 = new City("Halifax");
        City c2 = new City("Toronto");

        assertTrue(c1.compareTo(c2) < 0,"distance is not expected");
    }
    @Test
    public void testCompareToGreater()
    {
        City c1 = new City("Toronto");
        City c2 = new City("Halifax");

        assertTrue(c1.compareTo(c2) > 0,"distance is not expected");
    }
    @Test
    public void testCompareToEqual()
    {
        City c1 = new City("Halifax");
        City c2 = new City("Halifax");

        assertTrue(c1.compareTo(c2) == 0,"distance is not expected");
    }

}
