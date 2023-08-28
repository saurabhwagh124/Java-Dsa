class downdecalp{

	public static void main(String[] sau){
	
		int n=4;
		for(int i=1;i<=n;i++){
		
			char w='A';
			for(int j=1;j<=n-i+1;j++){
			
				System.out.print(w+" ");
				w++;
			}
			System.out.println();
		}

	}
}
