package collectionsex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product{
	public int pid;
	public String pname;
	public int qty;
	public double price;
	public Product(int pid, String pname, int qty, double price) {
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}

}
class ProductIdSorting implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.pid<p2.pid) {
			return -1;
		}else if(p1.pid>p2.pid) {
			return 1;
		}else {
			return 0;
		}
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(100,"abc",45,450));
		products.add(new Product(300,"xyz",55,550));
		products.add(new Product(200,"pqr",35,650));
		System.out.println("Without sorting Product List");
		for(Product p:products) {
			System.out.println(p.pid+" "+p.pname+" "+p.qty+" "+p.price);
		}
		Collections.sort(products,new ProductIdSorting());
		System.out.println("--Product Id based Sorting--");
		for(Product p:products) {
			System.out.println(p.pid+" "+p.pname+" "+p.qty+" "+p.price);
		}

	}

}
