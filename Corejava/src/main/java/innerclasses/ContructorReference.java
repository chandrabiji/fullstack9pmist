package innerclasses;

import java.util.function.Function;

class People{
	String name;

	public People(String name) {
		this.name = name;
	}
	void introduce() {
		System.out.println("Hello My Name is "+name);
	}
	
}
public class ContructorReference {

	public static void main(String[] args) {
		Function<String,People> personConstructor = People::new;
		People charan = personConstructor.apply("Sai Charan");
		charan.introduce();

	}

}
