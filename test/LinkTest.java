import  org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


class LinkTest {

  public static final String city1Name = "City1";
  public static final String city2Name = "City2";
  public static final String city3Name = "City3";
  public static final int cityDistance = 3;

  City c1 = new City(city1Name);
  City c2 = new City(city2Name);

  @Test
  void constructorTest()
  {
    Link l = new Link(c1,c2,cityDistance);
    assertEquals(c1,l.city1,"city1 is not equal to l.city1");
    assertEquals(c2,l.city2,"city2 is not equal to l.city2");
    assertEquals(cityDistance,l.length,"citydistance is not equal to l.citydistance");

  }
  /* getLength() returns the length length of a link */
  @Test
  void getLength() {

  }

  /* getAdj() returns city1 if c is city2 */
  @Test
  void getAdj_city1() {

  }

  /* getAdj() returns city2 if c is city1 */
  @Test
  void getAdj_city2() {


  }

  /* isUsed() returns true if the link is on a shortest path */
  @Test
  void isUsed_true() {
    City city1 = new City(city1Name);
    City city2 = new City(city2Name);
    Link link = new Link(city1, city2, cityDistance);
    link.setUsed(true);
    assertTrue(link.isUsed() == true, "true was not returned on the path");
  }

  /* isUsed() returns false if the link is not  on a shortest path */
  @Test
  void isUsed_false() {
    City city1 = new City(city1Name);
    City city2 = new City(city2Name);
    Link link = new Link(city1, city2, cityDistance);
    link.setUsed(false);
    assertTrue(link.isUsed() == false, "false was not returned on the path");
  }


  /* setUsed() set to true */
  @Test
  void setUsed_true() {
    City city1 = new City(city1Name);
    City city2 = new City(city2Name);
    Link link = new Link(city1, city2, cityDistance);
    link.setUsed(true);
    assertTrue(link.used == true, "user was not set to true");
  }

  /* setUsed() set to true */
  @Test
  void setUsed_false() {
    City city1 = new City(city1Name);
    City city2 = new City(city2Name);
    Link link = new Link(city1, city2, cityDistance);
    link.setUsed(false);
    assertTrue(link.used == false, "user was not set to false");
  }


}