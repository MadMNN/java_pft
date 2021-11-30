package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {

    Point p1 = new Point(2,3);
    Point p2 = new Point(4,5);


    System.out.println(" расстояние методом = " + p1.distance_m(p2));


    System.out.println("Hello");


Square s = new Square(4);
    System.out.println("Площадь квадрата " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);
    System.out.println("Площадь прямоугольника " + r.a + "  и " + r.b + " = " +r.area());


  }




}