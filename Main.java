/*class Marrage{
  public static void main (String[] args) {

    String gender = "m";
    String gender2 = "f";

    int age = 19;
    int age2 = 22;


    if (gender == "m" && age >= 21) {
      System.out.println("you are eligible to married");

      if (gender2 == "f" && age2 >= 18 ) {
        System.out.println("you are eligible for maggige");
      }
      else {
        System.out.println("you are under age ");
      }

    } else {
      System.out.println("you are under age ");
    }
  }
}
  */

  //try 2 
class Married {
    public static void main(String[] args) {

        String gender = "m";
        int age = 22;

        if (gender.equals("m")) {
            if (age >= 21) {
                System.out.println("you are eligible for marriage");
            } else {
                System.out.println("you are not eligible for marriage");
            }
        } else if (gender.equals("f")) {
            if (age > 18) {
                System.out.println("you are eligible for marriage");
            } else {
                System.out.println("you are not eligible for marriage");
            }
        } else {
            System.out.println("you are different");
        }
    }
}
