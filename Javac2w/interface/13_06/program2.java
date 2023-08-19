interface demo{

	default void fun(){
	
		System.out.println("In fun-demo");
	}
}
interface demo2{

	default void fun(){
	
		System.out.println("In gun-demo2");
	}
}
class child implements demo2,demo{

	public void fun(){
	
		System.out.println("In child");
	}
}
class client{

	public static void main(String [] sau){
	
		child obj = new child();
		obj.fun();
		demo obj1 = new child();
		obj1.fun();
		demo2 obj2 = new child();
		obj2.fun();
	}
}
