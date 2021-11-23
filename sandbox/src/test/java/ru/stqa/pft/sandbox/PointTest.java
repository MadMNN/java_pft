package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
  @Test
          public void TestDistance(){

    Point p1 = new Point(4,4);
    Point p2 = new Point(5,5);
    Assert.assertEquals(p1.distance_m(p2),1.4142135623730951);
  }




}
