class revorder{

	public static void main(String [] sau){
	
		int N=7;
		int a;
		int b;
		if(N%2==0){
			while(N!=0){
				a=N%10;
				System.out.println(a);
				N--;
			}
		}else{
			System.out.println(N);
			while(N>0){
				b=N-2;
				if(b>0)
				System.out.println(b);
				N=b;
			}
		}
	}
}
