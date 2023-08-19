class perfect{

	public static void main(String[] sau){
	
		int N=6;
		int a=0;
		for (int i=1;i<N;i++){
		
			if(N%i==0){
			
				a=a+i;
			}
		}if(a==N){
			
			System.out.println(N+"is a perfect number");
		}else
			System.out.println("Not a perfect number");
		
	}
}
