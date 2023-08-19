class strong{

	public static void main(String[] sau){
	
		int n=145;
		int a=0;
		int b=n;
		int c=0;
		while(b!=0){
		
			int fact=1;
			a=b%10;
			for(int i=1;i<=a;i++){
			
				fact=fact*i;
			}
			c=c+fact;
			b=b/10;
		}
		if(n==c){
		
			System.out.println(n+" is a strong number");
		}else
			System.out.println(n+" is not a strong number");
	}
}
