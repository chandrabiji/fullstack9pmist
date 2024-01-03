class Parent{
  Parent(){
    System.out.println("Parent Default");
  }
  Parent(int i){
    this();
    System.out.println("Parent Parameterized");
  }

}
class Child extends Parent{

  Child(){
   super(10);
   System.out.println("Child Default");
  }
  Child(int i){
   this();
   System.out.println("Child Parameterized ");
  }
  public static void main(String[] args){
       Child c = new Child(10);

  }

}