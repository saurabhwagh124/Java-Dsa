class reverseno{

	public static void main(String[] sau){
	
		int N=942111423;
		int a=0;
		int b=0;
		int c=0;
		while(N!=0){
		
			c=b*10;
			b=c;
			a=N%10;
			b=b+a;
			N=N/10;

		}
		System.out.println(b);
	}
}
