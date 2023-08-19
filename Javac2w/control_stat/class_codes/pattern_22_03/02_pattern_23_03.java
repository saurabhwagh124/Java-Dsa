class alphanum{

	public static void main(String[] sau){
	
		int n=3;
		for(int i=1;i<=n;i++){
		
			int a=1;
			char w='A';
			for(int j=1;j<=n;j++){
			
				if(n%2!=0){
				
					System.out.print(w+" ");
					w++;
				}
				else{
				
					System.out.print(a+ " ");
					a++;
				}
			}
			System.out.println();
		}
	}
}
