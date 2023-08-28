class alphanumdecree{

	public static void main(String[] sau){
	
		int a=1;
		int n=4;
		char w='A';
		for(int i=1;i<=n;i++){
		
			for(int j=1;j<=n-i+1;j++){
			
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
