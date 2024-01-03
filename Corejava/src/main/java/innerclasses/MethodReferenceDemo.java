package innerclasses;

import javax.print.attribute.standard.PrinterName;

class Person{
	void printName() {
		System.out.println("Chandra");
	}
}
@FunctionalInterface
interface Printer{
	void print();
}
public class MethodReferenceDemo {

	public static void main(String[] args) {
		Person person = new Person();
		Printer printer = person::printName;
		printer.print();

	}

}
