class alpnumincrease{

	public static void main(String[] sau){
	
		int n=4;
		int a=1;
		char w='A';
		for(int i=1;i<=n;i++){
		
			for(int j=1;j<=i;j++){
			
				if(j%2!=0){
				
					System.out.print(a+" ");
				}else{
				
					System.out.print(w+ " ");
				}
				a++;
				w++;
			}
			System.out.println();
		}
	}
}
