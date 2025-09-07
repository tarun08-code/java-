class Car {

  static {
    System.out.println(1); //static block looks -- remember,static blocks execute even before main method
  }
  public static void main (String[] args) {

    Car c = new Car(); // creating obejct will activate the non-static block or else no non block 

    System.out.println("hello");
    
  }
  {
    System.out.println(2); //non-static block looks -- remember,non-static blocks execute when an object is created
  }

}