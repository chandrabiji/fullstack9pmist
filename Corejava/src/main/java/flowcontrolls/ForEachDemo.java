package flowcontrolls;

public class ForEachDemo {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		System.out.println("--by using Normal For Loop--");
		for(int i=0;i<arr.length;++i) {
			System.out.println(arr[i]);
		}
		System.out.println("--forEach Loop--");
		for(int k:arr) {
			System.out.println(k);
		}
	}

}
