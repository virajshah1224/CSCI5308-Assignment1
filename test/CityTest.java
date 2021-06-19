import  org.junit.jupiter.api.*;

import java.util.HashSet;
import java.util.Set;

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

    @Test
    public void testToString()
    {
        City c = new City("Hello");
        assertEquals("Hello",c.toString());
    }

    @Test
    public void testCompareGreater()
    {
        City c = new City("Greater");
        City c1 = new City(4);
        City c2 = new City(3);
        assertTrue(c.compare(c1,c2) > 0,"False");
    }

    @Test
    public void testCompareSmaller()
    {
        City c = new City("Smaller");
        City c1 = new City(2);
        City c2 = new City(3);
        assertTrue(c.compare(c1,c2) < 0,"False");
    }

    @Test
    public void testCompareEqual()
    {
        City c = new City("Equal");
        City c1 = new City(3);
        City c2 = new City(3);
        assertTrue(c.compare(c1,c2) == 0,"False");
    }

    @Test
    public void testGetLinksTo_true()
    {
        City c1 = new City("Toronto");
        City c2 = new City("Halifax");
        Set<Link> hs = new HashSet<Link>();
        Link l = new Link(c1,c2,3);
        assertTrue(c1.getLinksTo(c2,hs)==true,"False");
    }

    @Test
    public void testGetLinksTo_false_condition1()
    {
        City c1 = new City("Toronto");
        City c2 = new City("Halifax");
        Set<Link> hs = new HashSet<Link>();
        //Link l = new Link(c1,c2,3);
        assertTrue(c1.getLinksTo(c2,hs)==false,"False");
    }
    @Test
    public void testGetLinksTo_false_condition2()
    {
        City c1 = new City("Toronto");
        City c2 = new City("Halifax");
        Set<Link> hs = new HashSet<Link>();
        Link l = new Link(c1,c2,3);
        l.setUsed(false);
        assertTrue(c1.getLinksTo(c2,hs)==false,"False");
    }
    @Test
    public void testGetLinksTo_false_condition3()
    {
        City c1 = new City("Toronto");
        City c2 = new City("Halifax");
        City c3 = new City("Halifax");
        Set<Link> hs = new HashSet<Link>();
        Link l = new Link(c1,c3,3);
        Link l1 = new Link(c1,c2,3);
        c3.parent = l;
        assertTrue(c3.getLinksTo(c1,hs)==false,"False");
    }

}
