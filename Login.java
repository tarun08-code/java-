class LoginValidation{
  public static void main(String[] args) {

    String id = "admin";
    int password = 123;

    if ( id == "admin"){
      System.out.println("user is valid");

      if(password == 123){

        System.out.println("password is valid ");
        System.out.println("login is successful");
      }
      else {
        System.out.println("password is invlid");
        System.out.println("login unsuccessfull");

      }

    }
    else {
      System.out.println("user is invlid");
        System.out.println("login unsuccessfull");
    }

  }
  
}