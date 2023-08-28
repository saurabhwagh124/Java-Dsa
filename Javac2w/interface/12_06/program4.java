interface demo1{

	static void m1(){
	
		System.out.println("Demo1-m1");
	}

}
interface demo2{

	static void m1(){
	
		System.out.println("Demo2-m1");
	}
}
interface demo3 extends demo2,demo1{
}
class child implements demo3{


	public static void main(String [] sau){
	
		//demo1 obj1 = new child();
		//obj1.m1(); //error as illegal start of expression
		demo2.m1();
	}
}
