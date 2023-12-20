class sumnumbers{


	static int x=0;
	static void sumit(int n){
	
		if(n==0){
		
			System.out.println(x);
			return;
		}
		else{
		
			x=x+n;
			n--;
			sumit(n);
		}
	}

	public static void main(String [] sau){
	
		sumnumbers.sumit(10);
	}
}
