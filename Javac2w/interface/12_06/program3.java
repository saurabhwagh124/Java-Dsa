interface demo{

	void fun();

}
interface demo1{

	void fun();
}
class child implements demo,demo1{

	public void fun(){
	
		System.out.println("In fun child");
	}
}
class client{

	public static void main(String [] sau){
	
		demo obj1 = new child();
		obj1.fun();
		demo1 obj2 = new child();
		obj2.fun();
	}
}
