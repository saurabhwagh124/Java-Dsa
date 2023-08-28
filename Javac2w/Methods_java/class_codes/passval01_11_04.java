import java.util.*;
class demo{

	static void add(int a, int b){
	
		int ans = a+b;
		System.out.println(ans);
	}
	public static void main(String[] sau){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		add(a,b);
	}
}
