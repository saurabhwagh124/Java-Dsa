class bill{

	public static void main(String[] args){
	
		int a = 320;
		if(a<=100){
		
			System.out.println("Bill is "+a*1);
		}else
			System.out.println("Bill is "+(100*1+(a-100)*2));
	}
}
