package oops;
//class = common(variables + Metods)
public class Person {
	
	//common variables
	String name;
	int age;
	int height;
	int weight;
	
	//common Method
	public void eat() {
		System.out.println("Mr . "+name+" eat Nice Food");
	}
	public void sleep() {
		if(age<18) {
			System.out.println("Sleep at least 9 hours");
		}else {
			System.out.println("Sleep at least 8 hours");
		}
	}

	public static void main(String[] args) {
		//Object = Instance of a class
		Person child = new Person();
		child.name="Sai";
		child.age=12;
		child.height=12;
		child.weight=18;
		child.eat();
		child.sleep();

	}

}
