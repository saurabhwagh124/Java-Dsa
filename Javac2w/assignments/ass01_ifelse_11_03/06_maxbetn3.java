class max3{

	public static void main(String[] sau){
		
		int num1=2;
		int num2=2;
		int num3=2;
		int max=num1;
		if(max<num2){
			max=num2;
		}
		if(max<num3){
			max=num3;
		}
		if(num1==num2 && num2==num3){
			System.out.println("all 3 are equal " +max);
		}else if(max==num1 && max==num2){
		
			System.out.println("num1 and num2 are equal & max  " +max);
		}else if(max==num2 && max==num3){
		
			System.out.println("num2 & num3 are equal & max "+max);
		}else if(max==num1 && max==num3){
		
			System.out.println("num1 & num3 are equal & max "+max);
		}else 
			System.out.println("max is "+max);
	}
}
