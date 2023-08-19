class compo{

	public static void main(String[] sau){
	
		int n=2;
		int count=0;
		for(int i=1;i<=8;i++){
		
			if(n%i==0){
			
				count++;
			}
		}
		if(count>2){
		
			System.out.println(n+" is a composite number");
		}else
			System.out.println(n+" is not a composite number");
	}
}
