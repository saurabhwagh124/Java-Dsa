class numvar{

	public static void main(String[] sau){
	
		int n=4;
		int m=3;
		int a=1;
		char w='A';
		for(int i=1;i<=m;i++){
		
			for(int j=1;j<=n;j++){
			
				if(j%2!=0){
				
					System.out.print(w+" ");
					w++;
				}
				else{
				
					System.out.print(a+" ");
					a++;
				}
			}
			System.out.println();
		}	
	}
}
