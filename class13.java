//methods we are learning 
// set of tasks is called methods 
class Demo {
  void display(){
    System.out.println("hello from method ");
  }
}

class demo2{
  public static void main (String[] args){
    Demo d = new Demo(); //object creation 

    d.display(); //calling the method from other class 

  }
}

class add {

  int sum;
  void add(int a, int b){
    System.out.println(a+b);
  }
}

class add2 {

  public static void main (String[] args) {

    add a = new add();
    a.add(20,30); //method with arguments 
  }
}

//method with return trype 

class add3 {

  public static void main (String[] args){
    add b = new add();
    
  }
}