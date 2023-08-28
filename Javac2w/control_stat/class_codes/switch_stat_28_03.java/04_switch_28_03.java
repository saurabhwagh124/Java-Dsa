class switchdemod{

	public static void main(String[] sau){
	
		int x=5;
		int a=1;
		int b=2;
		switch(x){
		
			case a:
				System.out.println("one");
				break;
			case b:
				System.out.println("two");
				break;
			case a+b:
				System.out.println("three");
				break;
			case a+a+b:
				System.out.println("four");
				break;
			case a+b+b:
				System.out.println("five");
				break;
			default:
				System.out.println("none");
				break;

		}
	}
}
