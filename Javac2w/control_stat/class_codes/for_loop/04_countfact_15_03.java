class factcount{

	public static void main(String[] sau){
	
		int N=8;
		int count=0;
		for(int i=1;i<=N;i++){
		
			if(N%i==0){
				count++;
			}
		}
		System.out.println(count);
	}
}
