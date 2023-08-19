class scopeone{

	public static void main(String[] sau){
	
		int x=10, y=20;
		{
			System.out.println(x+ " " +y);
		}
		{
			x=15;
			System.out.println(x+ " " +y);
		}
			System.out.println(x+ " " +y);
	}
}
