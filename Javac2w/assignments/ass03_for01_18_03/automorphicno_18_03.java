class automorph{

	public static void main(String[] sau){
	
		int n=7;
		int a=n;
		int count=0;
		int b=n;
		int rem =0;
		int c=0;
		int d=0;
		int sq=n*n;
		while(a!=0){
		
			count++;
			a=a/10;
		}
		for(int i=1;i<=count;i++){
		
			rem=sq%10;
			c=c*10+rem;
			sq=sq/10;
		}
		while(c!=0){
		
			rem=c%10;
			d=d*10+rem;
			c=c/10;
		}
		if(d==n){
		
			System.out.println(n+" is an automorphic number");
		}else
			System.out.println(n+" is not an automorphic number");
	}

}
