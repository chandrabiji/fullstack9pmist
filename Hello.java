class Hello{
Hello(){
 System.out.println("Default constructor");
}
Hello(int i){
  this();
  System.out.println("Parameterized Constructor");

}
public void m1(){
 System.out.println("From m1");
}
public static void main(String[] args)
{
  Hello h = new Hello(10);//instance or object
  System.out.println("Hello World");
  h.m1();
}
}