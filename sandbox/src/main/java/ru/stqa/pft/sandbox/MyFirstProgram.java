package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {

    String s = "str ", s1 = "ing";

    System.out.println(s+s1);


    System.out.println("Hello");
hello("1123");
hello("123 ");
double t3 = 4;
    System.out.println(kvad(t3));


  }

  public static double kvad(double l) {
return l*l;

  }



  public static void hello(String somebody) {

    System.out.println("World " + somebody);

  }

}