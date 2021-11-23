package ru.stqa.pft.sandbox;

public class Point {

  public double x;
  public double y;

  public static void main(String[] args) {
    Point p1 = new Point(2,3);
    Point p2 = new Point(4,5);

    System.out.println( " расстояние функцией " + distance(p1,p2));
    System.out.println(" расстояние методом = " + p1.distance_m(p2));


  }

  public Point(double x,double y){
    this.x = x;
    this.y = y;
  }


  public static double distance(Point p1, Point p2){
    return Math.sqrt((p2.x- p1.x)*(p2.x- p1.x)+(p2.y- p1.y)*(p2.y- p1.y));
  }

  public double distance_m(Point p2){

    return Math.sqrt((p2.x- this.x)*(p2.x- this.x)+(p2.y- this.y)*(p2.y- this.y));
  }

}
