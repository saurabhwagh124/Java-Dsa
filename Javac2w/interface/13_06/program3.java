interface demo{

	static void fun(){
	
		System.out.println("In fun");
	}
}
class child implements demo{


}
class client{

	public static void main(String [] sau){
	
		child obj = new child();
		obj.fun();
	}
}
