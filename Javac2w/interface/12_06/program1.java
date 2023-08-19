interface demo{

	void fun();
	void gun();
}
class child implements demo{

	public void fun(){
	
		System.out.println("In fun");
	}
	public void gun(){
	
		System.out.println("In gun");
	}
}
class client{

	public static void main(String [] sau){
	
		demo obj = new child();
		obj.fun();
		obj.gun();
	}
}

