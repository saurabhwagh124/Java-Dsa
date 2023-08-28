class squareven{

	public static void main(String[] sau){
	
		int N=942111423;
		int a;
		while(N!=0){
		
			a=N%10;
			if(a%2==0){
				System.out.println(a*a);
			}
			N=N/10;
		}
	}
}
