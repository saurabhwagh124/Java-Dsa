class lengthofdigits{

	static int x=0;
	static void length(int n){
	
		if(n<=0){
		
			System.out.println(x);
			return;
		}
		else{
		
			x++;
			n=n/10;
			length(n);
		}
	}
	public static void main(String [] sau){
	
		lengthofdigits.length(134);

	}
}
