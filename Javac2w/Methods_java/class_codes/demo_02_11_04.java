class methodvar{

	int x =10;
	static int y =20;
	void fun(){
	
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] sau){
	
		methodvar obj = new methodvar();
		obj.fun();
	}
}
