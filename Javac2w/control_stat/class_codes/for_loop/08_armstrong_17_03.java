class armstrongno{

	public static void main(String[] sau){
	
		int n=164;
		int a=n;
		int rem=0;
		int b=n;
		int sum=0,count=0;
		while(a!=0){
			count++;
			a=a/10;
		}
		while(b!=0){
			 rem=b%10;
			int mult=1;
		
			for(int i=1;i<=count;i++){
				mult=mult*rem;
			}
		sum=sum+mult;
		b=b/10;
		}
		if(n==sum){
			System.out.println(n+" is an armstrong number");
		}else
			System.out.println(n+" is not an armstrong number");
		
	}

}
