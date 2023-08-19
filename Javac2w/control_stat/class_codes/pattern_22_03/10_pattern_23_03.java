class condsqdowninc{

	public static void main(String[] sau){
	
		int n=4;
		int a=1;
		for(int i=1;i<=n;i++){
		
			for(int j=1;j<=i;j++){
			
				if(j%2!=0){
				
					System.out.print(a*a+" ");
				}
				else{
				
					System.out.print(a+" ");
				}
				a++;
			}
			System.out.println();
		}
	}
}
