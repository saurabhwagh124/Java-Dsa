class printprime{

	public static void main(String[] sau){
	
		int N=8;
		int a=0;
		for(int i=1;i<=N;i++){
		
			if(N%i==0){
				a++;
			}
		}
		if(a==2){
			System.out.println(N+"is a prime number");
		}else 
			System.out.println("Not a prime number");
	}
}
