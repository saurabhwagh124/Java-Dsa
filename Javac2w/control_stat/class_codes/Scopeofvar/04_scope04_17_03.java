class scope4{

	public static void main(String[] sau){
	
		int x=10;
		{
		
			 x=20;
			System.out.println(x);

		}
		{
		
			 x=30;
			System.out.println(x);

		}
		System.out.println(x);
	}
}
