import java.util.*;
class Demo{
		//Hashmap dominates gaarbage collector so whe an object is null then though gc cannot free that object but weak map gives gc that privilege, when gc frees an object it the notifies the class using finalize method

	String str = null;
	Demo(String str){
	
		this.str = str;
	}
	public String toString(){
	
		return str;
	}
	public void finalize(){
	
		System.out.println( "GC aaya bhaiya, BHAAGO!!");
	}	
}

class GC1{

	public static void main(String [] sau){
	
		Demo obj1 = new Demo("Ashwatthama");
		Demo obj2 = new Demo("Bihari");
		Demo obj3 = new Demo("Sufferm4n");

		WeakHashMap whm = new WeakHashMap();
		whm.put(obj1,"Fake");
		whm.put(obj2,"Normie");
		whm.put(obj3, "M4nwhore");

		System.out.println(whm);

		obj3 = null;
		System.gc();
		System.out.println(whm);
	}
}
