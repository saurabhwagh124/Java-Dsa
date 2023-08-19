interface demo{


	void fun();
	void gun();

}
abstract class child implements demo{


	public void gun(){
	
		System.out.println("In gun");
	}
}
class child2 extends child{

	public void fun(){
	
		System.out.println("In fun");
	}
}
class client{

	public static void main(String [] sau){
	
		demo obj = new child2();
		obj.fun();
		obj.gun();

	}
}
