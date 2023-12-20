import java.util.*;
class sumdigits{

	static int summing(int n){
	
		if(n<=0){
		
			return 0;
		}
		int a = n%10;
		n=n/10;
		return a+summing(n);
	}


	public static void main(String[] sau){
	
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		System.out.println(sumdigits.summing(a));

	}

}
