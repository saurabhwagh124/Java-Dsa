interface demo{

	void gun();
	default void fun(){
	
		System.out.println("IN fun");
	}
}
class child implements demo{

	public void gun(){
	
		System.out.println("In gun");
	}
}
class client{

	public static void main(String [] sau){
	
		demo obj = new child();
		obj.gun();
		obj.fun();
	}
}
