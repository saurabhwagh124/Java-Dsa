class oddcount{
	public static void main(String[] sau){
		int a;
		int i=0;
		int N=942111423;
		while(N!=0){
			a=N%10;
			if(a%2!=0){
				i++;
			}
			N=N/10;
		}
		System.out.println("Count of odd digits= "+i);
	}
}
