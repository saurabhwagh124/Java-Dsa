 class sumall{
 
	 public static void main(String sau[]){
	 
		 int N = 7842;
		 int sum = 0;
		 while(N!=0){
		 
			 int a=N%10;
			 sum=sum+a;
			 N=N/10;
		 }
		 System.out.println(sum);
	 }
 }
