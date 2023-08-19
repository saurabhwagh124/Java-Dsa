class multiplyall{

	public static void main(String sau[]){
	
		int N=221;
		int mult=1;
		while(N!=0){
		
			int a=N%10;
			mult=mult*a;
			N=N/10;
		}
		System.out.println(mult);
	}
}
