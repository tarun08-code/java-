class Student {
  static int age = 10;
  static void study() {
    System.out.println("dying");
  }
}

public static void main(String[] args){
  System.out.println(Student.age); //if class name is not static use object reference
  Student.study();
}