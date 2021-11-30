package ru.stqa.pft.sandbox;

public class Point {

  public double x;
  public double y;

  public static void main(String[] args) {
    Point p1 = new Point(2,3);
    Point p2 = new Point(4,5);


    System.out.println(" расстояние методом = " + p1.distance_m(p2));


  }

  public Point(double x,double y){
    this.x = x;
    this.y = y;
  }




  public double distance_m(Point p2){

    return Math.sqrt((p2.x- this.x)*(p2.x- this.x)+(p2.y- this.y)*(p2.y- this.y));
  }

}
