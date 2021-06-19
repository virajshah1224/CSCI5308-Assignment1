import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CityComparatorTest {

  public static final String city1Name = "City1";
  public static final String city2Name = "City2";
  public static final int cityDistanceShort = 1;
  public static final int cityDistanceLong = 2;

  CityComparator c = new CityComparator();
  /* 1a. compare returns negative if 0 <= x.distance <= y.distance */
  @Test
  public void compare_xSmaller() {

    City c1 = new City(cityDistanceShort);
    City c2 = new City(cityDistanceLong);

    assertTrue(c.compare(c1,c2) > 0,"city distance is long so false");
  }

  /* 1b. compare returns 0 if 0 <= x.distance == y.distance */
  @Test
  void compare_xEqual() {

    City c1 = new City(cityDistanceShort);
    City c2 = new City(cityDistanceShort);
    assertTrue(c.compare(c1,c2) == 0,"city distance is long so false");
  }

  /* 1c. compare returns positive if 0 <= x.distance <= y.distance */
  @Test
  void compare_xLarger() {

    City c1 = new City(cityDistanceLong);
    City c2 = new City(cityDistanceShort);
    assertTrue(c.compare(c1,c2) < 0,"city distance is long so false");
  }

}