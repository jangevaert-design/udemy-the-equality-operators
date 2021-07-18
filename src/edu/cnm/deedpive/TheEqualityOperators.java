package edu.cnm.deedpive;

public class TheEqualityOperators {

  public static void main(String[] args) {
    int a = 3;
    int b = 5;
    boolean c = (a == b);// c will be false.
    boolean d = (a != b);// d will be true.

    //boolean g = (true == 5); this will not compile.
    //boolean h = (false == "test"); this will not compile.

    boolean x = true;
    boolean y = false;
    boolean z = (y = true) && (x = false); //sets y to true. && is a short circuit operator but
    //second part needs to be checked -> sets x to false. boolean z will be false.
  }

}
