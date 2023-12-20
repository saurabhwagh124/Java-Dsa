class check{

	static boolean isprime(int n, int t){
	
		if(n<=2)
			return (n==2) ? true:false;
			if(n%t==0)
				return false;
			if(t*t>n)
				return true;
			return isprime(n,t+1);
	}
	public static void main(String[] sau){
	
		boolean a = check.isprime(73,2);
		if(a==true)
			System.out.println("Is a prime number");
	
	}
}
