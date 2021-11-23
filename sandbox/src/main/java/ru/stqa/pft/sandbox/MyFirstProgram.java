package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {

    String s0 = "str ", s1 = "ing";

    System.out.println(s0+s1);


    System.out.println("Hello");


Square s = new Square(4);
    System.out.println("Площадь квадрата " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);
    System.out.println("Площадь прямоугольника " + r.a + "  и " + r.b + " = " +r.area());


  }




}