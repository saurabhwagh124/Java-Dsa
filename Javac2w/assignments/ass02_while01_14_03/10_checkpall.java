class palli{

	public static void main(String[] sau){
	
		int N=2332;
		int a=0;
		int i=N;
		int b=0;
		int c=0;
		while(N!=0){
			c=b*10;
			b=c;
			a=N%10;
			b=b+a;
			N=N/10;
		}
		if(i==b)
			System.out.println(b+" is a pallindrome");
		else
			System.out.println("Not a pallindrome");
	}
}
