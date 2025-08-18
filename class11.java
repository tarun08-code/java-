//class and object learning 

class class11 {
  String name = "dinesh";
int salary = 120000;
int id = 123;
}

class Dinesh {
  public static void main (String[] args) {
    class11 obj = new class11();

    System.out.println(obj.id);
    System.out.println(obj.name);
    System.out.println(obj.salary);
  }
}