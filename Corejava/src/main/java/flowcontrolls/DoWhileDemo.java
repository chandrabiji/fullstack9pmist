package flowcontrolls;

public class DoWhileDemo {

	public static void main(String[] args) {
		int i = 100,sum=0;
		do {
			System.out.println(i);
			sum = sum +i;
			//i = i+1;
			//i +=1;
			++i;
		}while(i<=10);
		System.out.println("Sum of Number = "+sum);

	}

}
