//method over loading class 14 
//muliple methods can have same name but with different arguments or datatypes etc

import java.util.Scanner;

class Demo1 {
  void display(){
    System.out.println("meow");
  }
  void display(int a){
    System.out.println(a);
  }
  void display(double x){
    System.out.println(x);
  }
  void display(int x, String y){
    System.out.println(x + y);
  }
  void display(String x, int y){
    System.out.println(x + y);
  }
}

class demo22 {
  public static void main (String[] args){
    Demo1 d = new Demo1();
    d.display();
    d.display(8);
    d.display(09.0);
    d.display(40,"dinesh");


  }
}

class solutions {
   public static void main (String args){
    
   }
}