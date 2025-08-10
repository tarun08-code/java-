class Employee {
int id = 101;
String name = "dinesh";
double salary = 5000.0;

}

class Test {

  public static void main (String[] args){

    Employee em = new Employee();

    System.out.println(em.id);
    System.out.println(em.name);
    System.out.println(em.salary);
  }
}