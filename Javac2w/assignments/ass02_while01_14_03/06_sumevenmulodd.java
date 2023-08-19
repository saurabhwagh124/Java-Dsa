class sumprod{
	public static void main(String[] sau){
		
		int N=10;
		int a;
		int b=0;
		int c=1;
		while(N!=0){
		
			a=N%10;
			if(a%2==0){
				b=b+a;
			}else{
			
				c=c*a;
			}
			N--;
		}
		System.out.println("The sum of even numbers is = "+b);
		System.out.println("The product of odd numbers is = "+c);

	
	}
}
