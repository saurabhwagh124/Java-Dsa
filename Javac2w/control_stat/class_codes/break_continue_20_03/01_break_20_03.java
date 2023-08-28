class onebreak{
	public static void main(String[] sau){
	
		int n=40;
		int count=0;
		for(int i=1;i<=n;i++){
		
			if(n%i==0){
				count++;

			}
			if(count>2){
				break;
			}
		}
		if(count==2)
			System.out.printf("is prime");
		else
			System.out.println("not a prime");
	}


}
